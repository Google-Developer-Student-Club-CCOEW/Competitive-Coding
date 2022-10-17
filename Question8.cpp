#include <bits/stdc++.h>

typedef long long ll;
using namespace std;
void google(ll t) { cout << "Case #" << t+1 << ": "; }
void solve() {
    ll n;
    string s;
    cin>>n>>s;
    ll count0 = 0, count1 = 0;
    for (ll i = 0; i < n; i++)
    {
        if(s[i] == '0') count0++;
        else count1++;
    }
    if(count0%2 and count1%2) cout<<"NO\n";
    else cout<<"YES\n";
}

int main()
{
	ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
	ll t;
	t=1;
	cin>>t;
    
	for(ll test = 0; test < t; test++) {
        solve();
    }
	return 0;
}