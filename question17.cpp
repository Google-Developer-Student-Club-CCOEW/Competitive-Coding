#include <bits/stdc++.h>
using namespace std;

// IDEA: if we observe deeply than we can say that after every n+5 the final ans will increase by one
// this can be shown [R W W R W] so upto n==5 ans will be 1 and thn for every interval of 5 ans increase by 1

int fun(int n){
    int ans = n/5;
    if(n%5==0) return ans;
    else return ans+1;
}
int main()
{
   int t;
   cin>>t;
  for(int i=1;i<=t;i++){  
    int n;cin>>n;
    int ans = fun(n);
    cout<<"Case #"<<i<<": "<<ans<<endl;
   }
	
    return 0;
}
