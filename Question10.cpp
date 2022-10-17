#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define yes cout << "YES" << endl
#define no cout << "NO" << endl
const int M = 1e9 + 7;

int main()
{

    ll n;
    cin >> n;
    ll a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    map<ll, ll> m;
    for (int i = 0; i < n; i++)
    {
        m[a[i]]++;
    }
    ll c = 0;
    for (auto it : m)
    {
        if ((n % 2 == 1 && it.second > n / 2 + 1) || (n % 2 == 0 && it.second > n / 2))
        {
            no;
            c = 1;
            break;
        }
    }
    if (c == 0)
    {
        yes;
    }

    return 0;
}