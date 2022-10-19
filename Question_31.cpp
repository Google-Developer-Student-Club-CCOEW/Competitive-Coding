#include <iostream>
using namespace std;


int product(int num) {
    int product = 1;
    while (num != 0) {
        product *= num%10;
        num /= 10;
    }

    return product;
}

int sum(int num) {
    int sum = 0;
    while (num != 0) {
        sum += num%10;
        num /= 10;
    }

    return sum;
}

int checkSpecial(int a, int b) {
    int count = 0;
    for(int i = a; i <= b; i++) {
        if(product(i)%sum(i) == 0) {
            count++;
        }
    }
    return count;
}

int main() {
    int n;
    cin >> n;

    int a[n], b[n];

    for(int i = 0; i < n; i++) {
        cin >> a[i];
        cin >> b[i];
    }

    for(int i = 0; i < n; i++) {
        cout << "Case #" << i +1 << ": " << checkSpecial(a[i], b[i]) << endl;
    }
}
