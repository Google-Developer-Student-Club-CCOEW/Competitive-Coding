#include <bits/stdc++.h>
using namespace std;

//IDEA: for a particular day we see if John has maximum steps or not if not then we find the max and subtract
//from John's total steps and add it to a ans variable which at last print as final answer.

int main()
{
   int t; // number of test cases
   cin>>t;
   for(int k =1;k<=t;k++){
   int m,n,p;
   cin>>m>>n>>p;
   p--; // as in c++ we are having 0 based index
     
   int S[m][n]; //previous year records
   for(int i=0;i<m;i++)
       for(int j =0;j<n;j++)
           cin>>S[i][j]; 

  int ans = 0;     
   for(int i=0;i<n;i++){
      int temp=0;
       for(int j =0;j<m;j++)
        temp = max(temp,S[j][i]);
     if(temp>S[p][i])
       ans+=(temp-S[p][i]);
   }
  
    cout<<"Case #"<<k<<": "<<ans<<endl; 
    
   }
   
    return 0;
}
