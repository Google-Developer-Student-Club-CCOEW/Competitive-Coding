#include <bits/stdc++.h>
using namespace std;

int main()
{
   int t;
   cin>>t;
  for(int i=1;i<=t;i++){  
    int n;cin>>n;
    vector<pair<int,int>>arr(0);
    vector<int> ans(n,-1);
    // input
    for(int k =0;k<n;k++) {int temp;cin>>temp; arr.push_back({temp,k});}
    // sort
    sort(arr.begin(),arr.end());
    int j =0;
    // solution 
    for(int i=0;i<arr.size();i++){
     while(2*arr[i].first >= arr[j].first){if(j<arr.size()) j++; else break;}
     j--;
     if(i==j){
        if(j-1>=0) ans[arr[i].second]=arr[j-1].first;
     }else
         ans[arr[i].second]=arr[j].first;
    }
    

    cout<<"Case #"<<i<<": ";
    for(auto it:ans) cout<<it<<" ";
    cout<<endl;
   }
	
    return 0;
}
