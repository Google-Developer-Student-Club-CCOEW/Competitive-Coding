#include <bits/stdc++.h>
using namespace std;
#define ll long long
int main()
{
 
 int t; cin>>t;
 while (t--)
 {
int n; cin>>n;
   int x; cin>>x;
   int distict=2*x-1;
   if(distict>n)
   {
    cout<<"-1\n";
    continue;
   }  
 
    string s(n,'a');
    for(int i=1; i<x; i++)
    {
      s[i-1]='a'+i;
      s[n-i]='a'+i;
    }
  
cout<<s<<"\n";

 }
           
return 0;    
}

