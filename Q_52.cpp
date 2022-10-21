#include<bits/stdc++.h>
using namespace std;

vector<string> arr(151);
vector<vector<int> > match(151,vector<int> (151));

int pref(string t,string str)
{
    int n=str.length(),i,j;
    vector<int> pref(n,0);
    for(i=1;i<n;i++)
    {
        j=pref[i-1];

        while(j>0 && str[i]!=str[j])
            j=pref[j-1];

        if(str[j]==str[i])
            j++;

        pref[i]=j;
    }
    i=1,j=0;
    while(i<t.length())
    {
        if(t[i]==str[j])
        {
            i++;
            j++;
        }
        else
        {
            if(j!=0)
                j=pref[j-1];
            else
                i++;
        }
    }
    return j;
}

void solve()
{
    int n,l,k,i,j,ans,pos,it;
    cin>>n>>l>>k;
    vector<vector<int> > dp(501,vector<int> (151,INT_MAX));
    for(i=1;i<=n;i++)
        cin>>arr[i];
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
            match[i][j]=arr[i].length()-pref(arr[i],arr[j]);
    }
    // cout<<pref("abc","abc")<<endl;
    // for(i=1;i<=n;i++)
    // {
    //     for(j=1;j<=n;j++)
    //         cout<<match[i][j]<<" ";
    //     cout<<endl;
    // }
    for(i=1;i<=n;i++)
        dp[1][i]=arr[i].length();

    for(i=2;i<=k;i++)
    {
        for(j=1;j<=n;j++)
        {
            for(it=1;it<=n;it++)
                dp[i][j]=min(dp[i][j],dp[i-1][it]+match[it][j]);
        }
    }
    ans=INT_MAX;
    for(i=1;i<=n;i++)
    {
        if(dp[k][i]<ans)
        {
            pos=i;
            ans=dp[k][i];
        }
    }
    cout<<ans<<endl;
    string answer=arr[pos];
    vector<pair<int,int> > po;
    po.push_back(make_pair(pos-1,ans-l));
    for(i=k-1;i>=1;i--)
    {
        for(j=1;j<=n;j++)
        {
            if(dp[i][j]+match[j][pos]==ans)
            {
                ans=dp[i][j];
                break;
            }
        }
        //int tem=match[j][pos]==l?0:match[j][pos];
        //cout<<tem<<" "<<answer<<endl;
        answer=arr[j].substr(0,match[j][pos])+answer;
        po.push_back(make_pair(j-1,ans-l));
        pos=j;
    }
    cout<<answer<<endl;
    for(i=po.size()-1;i>=0;i--)
        cout<<po[i].first<<" "<<po[i].second<<endl;
    cout<<endl;
}

int main()
{
    ios::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);

    int tt;
    cin>>tt;
    while(tt--)
        solve();
}
