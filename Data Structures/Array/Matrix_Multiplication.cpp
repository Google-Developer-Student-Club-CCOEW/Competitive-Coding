#include<iostream>
using namespace std;
int main(){
	int i,j,k,l,sum=0,m1,n1,m2,n2,arr1[30][30],arr2[30][30],arr[30][30];
	cout<<"Enter the number of rows of first matrix"<<endl;
	cin>>m1;
	cout<<"Enter the number of columns of first matrix"<<endl;
	cin>>n1;
	cout<<"Enter the number of rows of second matrix"<<endl;
	cin>>m2;
	cout<<"Enter the number of columns of second matrix"<<endl;
	cin>>n2;
	cout<<"Enter the elements of matrix A"<<endl;
	for(i=0;i<m1;i++){
		for(j=0;j<n1;j++){
			cin>>arr1[i][j];
		}
		cout<<endl;
	}
	cout<<"Enter the elements of matrix B"<<endl;
	for(i=0;i<m2;i++){
		for(j=0;j<n2;j++){
			cin>>arr2[i][j];
		}
		cout<<endl;
	}
	cout<<"Matrix A"<<endl;
		for(i=0;i<m1;i++){
		for(j=0;j<n1;j++){
			cout<<arr1[i][j]<<"\t";
		}
		cout<<endl;
	}
	cout<<"Matrix B"<<endl;
		for(i=0;i<m2;i++){
		for(j=0;j<n2;j++){
			cout<<arr2[i][j]<<"\t";
		}
		cout<<endl;
	}
	if(n1==m2){
		for(i=0;i<m1;i++){
			for(j=0;j<n2;j++){
				for(k=0;k<n1;k++){
					arr[i][j]=arr1[i][k]*arr2[k][j];
				   sum=sum+arr[i][j];
				   arr[i][j]=sum;
				}
				sum=0;
			}
			
		}
		cout<<"The resultant matrix after multiplication is:"<<endl;
	for(i=0;i<m1;i++){
		for(j=0;j<n2;j++){
			cout<<arr[i][j]<<"\t";
		}
		cout<<endl;
	}
	}
	else
	cout<<"Multiplication operation cannot be performed"<<endl;
	
}
