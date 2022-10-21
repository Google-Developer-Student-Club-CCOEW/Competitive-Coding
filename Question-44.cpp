#include <iostream>

using namespace std;

int main()
{
    int t;
    cin>>t; //no. of test cases input
    
    for(int i=0; i<t; i++)
    {
        int arr[3];
        
        for(int j=0; j<3; j++)
        {
            cin>>arr[j];
        }
        
        //Tuple not possible when min(A,B), min(B,C), min(A,C) are distinct.
        if(arr[0]!=arr[1] && arr[1]!=arr[2] && arr[2]!=arr[0])
        {
            cout<<"NO"<<endl;
        }
        
        //Tuple always possible when at least any two minimum has same value.
        else
        {
            cout<<"YES"<<endl;
        }
    }
}
