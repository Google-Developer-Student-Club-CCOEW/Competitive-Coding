// C++ program for insertion sort  
#include <bits/stdc++.h> 
using namespace std; 
/* Function to sort an array using insertion sort*/
void insertionSort(int arr[], int n)  
{  
    int i, k, j;  
    for (i = 1; i < n; i++) 
    {  
        k = arr[i];  
        j = i - 1; 
        /*shifting elements of arr[0..i-1] towards right
		  if are greater than k */
        while (j >= 0 && arr[j] > k) 
        {  
            arr[j + 1] = arr[j];  
            j = j - 1;  
        }  
        arr[j + 1] = k;  
    }  
}  
int main()
{
    int n,i;
    // size of array
    cin>>n;
    int arr[n];
    for (i = 0; i < n; i++)  
        cin >> arr[i]; 
    // input the array       
    insertionSort(arr, n); 
	// sort the array 
    for (i = 0; i < n; i++)  
        cout << arr[i] << " ";  
    cout << endl;  
    // print the array
    return 0;  
}
