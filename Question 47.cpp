#include <iostream>
using namespace std;
int main() {
	int t,n;
	cin>>t;
	while(t--){
	    cin>>n;
	    string s;
	    cin>>s;
	    int i=0,j=n-1;
	    long long int c=0;
	    while(i<=j){
	        if(s[i]=='('&&s[j]==')'){
	            i++;
	            j--;
	        }
	        else if(s[i]=='('&&s[j]=='('){
	            c++;
	            j--;
	        }else if(s[i]==')'&&s[j]=='('){
	            c+=2;
	            i++;
	            j--;
	        }
	        else{
	            i++;
	            c++;
	        }   
	    }
	    cout<<c<<endl;
	}
	return 0;
}
