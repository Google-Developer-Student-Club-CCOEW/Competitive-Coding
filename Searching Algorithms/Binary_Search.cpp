/* Binary Search is a searching algorithm for finding an element's position in a sorted array.
In this approach, the element is always searched in the middle of a portion of an array.
Its time complexity is O(logn).  */

#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int binarysearch(int arr[],int size, int element){
	int low=0,mid,high=size-1;
	while(low<=high){
		mid=(low+high)/2;
		if(arr[mid]==element)
		return mid;
		else if(arr[mid]<element)
			low=mid+1;
		else
		high=mid-1;
	}
	return -1;
}
int main(){
	int arr[20],len,n,search;
	cout<<"Enter the size of array"<<endl;
	cin>>len;
	for(int i=0;i<len;i++){
		cout<<"Enter the"<<" "<< i+1 <<" "<<"element"<<endl;
		cin>>arr[i];
	}
	cout<<"Displaying array"<<endl;
	for(int i=0;i<len;i++){
		cout<<arr[i]<<endl;
	}
	cout<<"The sorted array is"<<endl;
	sort(arr,arr+len);
	for(int i=0;i<len;i++){
		cout<<arr[i]<<endl;
	}
	cout<<"Enter the element to search"<<endl;
	cin>>n;
	search=binarysearch(arr,len,n);
	if(search==-1)
	cout<<"Element not found"<<endl;
	else
	cout<<"Element found at position"<<" "<<search+1 <<endl;
}
