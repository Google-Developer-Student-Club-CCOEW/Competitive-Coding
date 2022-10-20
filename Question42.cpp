#include <iostream>
using namespace std;

bool checkCondition(int x) {

    for (int a = 1; a * a < x; a++) {
        if ((x != 2 * a) && ((x - 2 * a) % (2 + a)) == 0)
            return true;
    }
    return false;
}

int main() {
    int t;
    cin >> t;
    int x;
    while (t--) {
        cin >> x;
        if (checkCondition(x))
            cout << "YES" << "\n";
        else
            cout << "NO" << "\n";
    }
    return 0;
}