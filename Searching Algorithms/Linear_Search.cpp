#include<iostream>
using namespace std;
int linear_search(int arr[],int key,int size){
	for(int i=0;i<size;i++){
		if(arr[i]==key){
			return (i+1);
		}
	}
	return -1;
}
int main(){
	int arr[20],key,n,pos;
	cout<<"Enter the size of array"<<endl;
	cin>>n;
	for(int i=0;i<n;i++){
		cout<<"Enter the element"<<" "<<i+1<<endl;
		cin>>arr[i];
	}
	cout<<"Enter the element to search in the array"<<endl;
	cin>>key;
	pos= linear_search(arr,key,n);
	if(pos==-1){
		cout<<"Element not found"<<endl;
	}
	else{
		cout<<"Element found at position"<<" "<<pos<<endl;
	}
}
