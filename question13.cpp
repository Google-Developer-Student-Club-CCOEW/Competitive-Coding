#include <bits/stdc++.h>
using namespace std;

#define fo(i, n) for (int i = 0; i < n; i++)
#define Fo(i, k, n) for (int i = k; i < n ? i < n : i > n; k < n ? i += 1 : i -= 1)
#define ll long long
#define deb(x) cout << #x << " = " << x << endl
#define deb2(x, y) cout << #x << " = " << x << " . " << #y << " = " << y << endl
#define all(x) x.begin(), x.end()
#define sortall(x) sort(all(x))
#define tr(it, a) for (auto it = a.begin(); it != a.end(); it++)
#define PI 3.1415926535897932384626

typedef pair<int, int> pii;
typedef pair<ll, ll> pl;
typedef vector<int> vi;
typedef vector<ll> vl;
typedef vector<vi> vvi;
int mod = 1e9 + 7;
const long long INF = 1e18;

void solve();

int main()
{
  solve();
  return 0;
}

void solve()
{
  int tt;
  cin >> tt;
  while (tt--)
  {
    int t, n = 0, m = 0, a = 0, b = 0, c = 0, d, x, q, k, flag = 0, ans = 0, sumn = 0, count = 0;

    cin >> n;
    vi arr;
    fo(i, n)
    {
      cin >> x;
      arr.push_back(x);
    }

    x = *(min_element(arr.begin(), arr.end()));

    // deb(x);

    fo(i, n)
    {

      if (arr[i] % x != 0)
        flag = 1;
    }

    if (flag)
      cout << n;
    else
      cout << (n * x);

    cout << endl;
  }
}