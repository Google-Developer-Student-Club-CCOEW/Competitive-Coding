#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef long double ld;

int main()
{

    ll n, d;
    cin >> n >> d;
    vector<ll> a(n);

    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    ll sum = 0;
    sort(a.begin(), a.end());

    for (int i = n - 1; i > 0; i--)
    {
        if (a[i] - a[i - 1] < d)
        {
            sum += (a[i - 1] + a[i]);
            i--;
        }
    }

    cout << sum << "\n";
}