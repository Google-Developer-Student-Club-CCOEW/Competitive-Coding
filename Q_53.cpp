#include<bits/stdc++.h>
using namespace std;

int main(){
    long long int t, n, k;
    cin >> t;
    while(t--){
        cin >> n;
        k = ((n*(n+1))/2)+n;
        cout << k << endl;
    }
}
