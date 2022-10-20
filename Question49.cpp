#include<bits/stdc++.h>
typedef long long ll;
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int j=0; j<t; j++){
        int i,n;
 cin>>n;
 vector<string> str(n,".");
 for(i=0; i<n;i++)
 {
  cin>> str[i];
 }
 string a = "";
 for(i=0; i<n;i++)
 {
  if(str[i][i] == '0'){
   a += '1';
  }
  else{
   a += '0';
  }
 }
 cout<<a<<endl;
    }
    return 0;
}
