#include <iostream>
using namespace std;

int main() {
	
	int t;
	cin>>t; //no. of test cases
	
	for(int i=0; i<t; i++)
	{
	    int a,b;
	    cin>>a>>b; //a=current position of Vikram
	               //b=current position of Anay
	    
	    int mid=(a+b)/2;
	    
	    cout<<max(abs(a-mid), abs(b-mid))<<endl;
	}
}
