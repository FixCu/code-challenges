#include <iostream>
#include <cassert>

#define ALPHA_SIZE 27

char firstNotRepeatingCharacter(std::string s) {
    int mark[ALPHA_SIZE];
    int pos[ALPHA_SIZE];
    for (int i=0;i<ALPHA_SIZE;i++) {
        mark[i] = 0;
        pos[i] = -1;
    }

    for (int i=0;i<s.length();i++) {
        mark[s[i] - 'a']++;
        pos[s[i] - 'a'] = i;
    }

    int min = 1000007;
    char result = '_';
    for (int i=0;i<ALPHA_SIZE;i++) {
        if (mark[i] == 1 && min > pos[i]) {
            min = pos[i];
            result = char('a' + i);
        }
    }
    return result;
}

int main() {

    assert('c' == firstNotRepeatingCharacter("abacabad"));
    assert('g' == firstNotRepeatingCharacter("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof"));
    assert('_' == firstNotRepeatingCharacter("abacabaabacaba"));
    assert('_' == firstNotRepeatingCharacter(""));

    return 0;
}
