#include <iostream>
#include <vector>
#include <cassert>
#include <memory>
#include <queue>

#define ALPHA_SIZE 27

struct prefixTree {
    std::unique_ptr<prefixTree> children[ALPHA_SIZE];
    int count = 0;

    void insertWord(const std::string &word, const int position = 0) { // NOLINT(*-no-recursion)
        count++;
        if (position >= word.length()) {
            return;
        }

        int ch = (int) ((unsigned char) word[position] - 'a');
        if (!children[ch]) {
            children[ch] = std::make_unique<prefixTree>();
        }
        children[ch]->insertWord(word, position + 1);
    }

    std::string getLongestPrefix() {
#       define node std::pair<prefixTree*, std::string>
        std::queue<node > q;
        q.emplace(this, "");
        std::string solution;
        while (!q.empty()) {
            node v = q.front();
            q.pop();

            if (count == v.first->count) {
                solution = v.second;
                for (int i = 0; i < ALPHA_SIZE; i++) {
                    if (v.first->children[i]) {
                        q.emplace(v.first->children[i].get(), v.second + char('a' + i));
                    }
                }
            }
        }
        return solution;
    }
};

/**
 * Solution
 */
std::string longestCommonPrefix(const std::vector<std::string> &list) {
    prefixTree tree;
    for (const auto &word: list) {
        tree.insertWord(word);
    }
    return tree.getLongestPrefix();
}

int main() {

    assert("asdf" == longestCommonPrefix({"asdf", "asdf"}));
    assert(longestCommonPrefix({}).empty());
    assert("fl" == longestCommonPrefix({"flower", "flow", "flight"}));
    assert(longestCommonPrefix({"dog", "racecar", "car"}).empty());
    assert("lkhjasdfnvlkasjhdf" == longestCommonPrefix({"lkhjasdfnvlkasjhdf"}));

    return 0;
}
