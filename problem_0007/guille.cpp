#include <iostream>
#include <cassert>

int climbing(int n) {
#   define SIZE 55
    long dp[SIZE];

    for (int i = 0; i <= n; i++) {
        dp[i] = 0;
    }

    dp[0] = dp[1] = 1;
    for (int i = 0 ;i < n; i++){
        if (i + 1 <= n) {
            dp[i + 1] += dp[i];
        }
        if (i + 2 < n) {
            dp[i + 2] += dp[i];
        }
    }

    return dp[n - 1];
}

int main() {

    assert(1 == climbing(1));
    assert(2 == climbing(2));
    assert(3 == climbing(3));
    assert(5 == climbing(4));
    assert(8 == climbing(5));
    assert(2584 == climbing(17));

    std::cout << "!!!success!!!\n";

    return 0;
}
