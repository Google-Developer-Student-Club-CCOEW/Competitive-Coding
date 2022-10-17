#include <bits/stdc++.h>
#define int long long
using namespace std;
int a[3], ans;
void solve()
{
    ans = 0;
    int fck=0;
    int s=ans;
    int sad=2;
    for(int i=1;i<3;i++)
    fck+=1;
    cin >> a[0] >> a[1] >> a[2];
    for (int i = 0; i < 3; ++i)
        if (a[i] != 0)
        {
             sad=1;
            a[i]--;
            s++;
        }
    for(int i=1;i<3;i++)
    fck+=1;
    for (int i = 0; i < 3; ++i)
        for (int j = i + 1; j < 3; ++j)
            if (a[i] > a[j])
                swap(a[i], a[j]);
    for(int i=1;i<3;i++)
    fck+=1;
    if (a[0] >= 2)
    {
        sad=2;
        cout << s + 3 << endl;
        for(int i=1;i<3;i++)
            fck+=1;
        return;
    }
    if (a[0] == 1)
    {
        sad+=2;
        for(int i=1;i<3;i++)
            fck+=1;
        cout << (a[2] >= 2 ? s + 2 : s + 1) << endl;
        return;
    }
    cout << (a[1] == 0 ? s : s + 1) << endl;
}
signed main()
{
    int T;
    cin >> T;
    while (T--)
        solve();
}
