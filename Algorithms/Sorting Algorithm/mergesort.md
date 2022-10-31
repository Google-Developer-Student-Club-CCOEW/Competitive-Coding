# Merge Sort:

# Defination
Merge sort is a sort algorithm that splits the items to be sorted into two groups; 
recursively sorts each group, and merges them into a final sorted sequence.

# Features
• Is a comparison based algorithm
• Is a stable algorithm
• Is a perfect example of divide & conquer algorithm design strategy
• It was invented by John Von Neumann

# Image
https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Merge_sort_algorithm_diagram.svg/300px-Merge_sort_algorithm_diagram.svg.png

# Algorithm
ALGORITHM Merge sort ( A[0… n-1] )
//sorts array A by recursive merge sort
//i/p: array A
//o/p: sorted array A in ascending order
MergeSort(A, l, h):
 if l < h
 mid = (l+h)/2
 mergeSort(A, l, mid)
 mergeSort(A, mid+1, h)
 merge(A, l, mid, h)

ALGORITHM Merge ( a[ ], l,mid,h )
i=low
j=mid+1
k=low
c[20];
while(i<=mid && j<=high) do
   if(a[i]<a[j])
    c[k++]<- a[i++]
   else
    c[k++]<- a[j++]
end while
while(i<=mid) 
   c[k++]<- a[i++]
while(j<=high) 
   c[k++]<- a[j++]
for i=low to high
   a[i]<- c[i];
end for

# Code in Cpp:
#include <iostream>
#include <vector>

using std::cout;
using std::cin;
using std::vector;

// Merge Sort Algorithm

// Time complexity
// Best: O(n log n)
// Average: O(n log n)
// Worst: O(n log n)

// Space complexity: O(n)
template <class T>
void merge(vector<T>& list, int start, int mid, int end, int &nComparisons) { // merge two sorted sublists
    vector<T> left; // left sublist
    vector<T> right; // right sublist
    int leftSize = mid - start + 1; // size of left sublist
    int rightSize = end - mid; // size of right sublist

    for (int i = 0; i < leftSize; i++) { // copy left sublist to left vector
        left.push_back(list[start+i]); // copy element
    }

    for (int i = 0; i < rightSize; i++) { // copy right sublist to right vector
        right.push_back(list[i+mid+1]); // copy element
    }

    int pos = start; // position in list
    int leftPos = 0; // position in left sublist
    int rightPos = 0; // position in right sublist

    while (leftPos < leftSize && rightPos < rightSize) {    // while both sublists are not empty
        nComparisons++;    // increment comparisons
        if (left[leftPos] < right[rightPos]) { // if left element is smaller than right element
            list[pos] = left[leftPos]; // copy left element to list
            leftPos++; // increment left sublist position
        } else { // if right element is smaller than left element
            list[pos] = right[rightPos]; // copy right element to list
            rightPos++; // increment right sublist position
        }
        pos++; // increment position in list
    }

    while (leftPos < leftSize) { // while left sublist is not empty
        list[pos] = left[leftPos]; // copy left element to list
        leftPos++; // increment left sublist position
        pos++; // increment position in list
    }

    while (rightPos < rightSize) { // while right sublist is not empty
        list[pos] = right[rightPos]; // copy right element to list
        rightPos++; // increment right sublist position
        pos++; // increment position in list
    }
}

template <class T> // merge sort algorithm
void mergeSort(vector<T>& list, int start, int end, int &nComparisons) { // sort sublist

    if(end > start) { // if sublist is not empty
        int mid = (start + end) / 2;  // find midpoint of sublist
        mergeSort(list, start, mid, nComparisons); // sort left sublist
        mergeSort(list, mid+1, end, nComparisons); // sort right sublist
        merge(list, start, mid, end, nComparisons); // merge two sorted sublists
    }
}


int main()
{
    int nComparisons = 0;
    vector<int> list;
    int n;
    cout << "Enter the number of elements in the list: ";
    cin >> n;
    for (int i = 0; i < n; i++) {
        int x;
        cout << "Enter element " << i+1 << ": ";
        cin >> x;
        list.push_back(x);
    }
    cout << "The list is: ";
    for (int i = 0; i < n; i++) {
        cout << list[i] << " ";
    }
    cout << "\n";
    mergeSort(list, 0, n-1, nComparisons);
    cout << "The sorted list is: ";
    for (int i = 0; i < n; i++) {
        cout << list[i] << " ";
    }
    cout << "\n";
    cout << "The number of comparisons is: " << nComparisons << "\n";
    return 0;
}

# Example
https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/visualize/

# Analysis
Input size: Array size, n
• Basic operation: key comparison
• Best, worst, average case exists:
Worst case: During key comparison, neither of the two arrays becomes 
empty before the other one contains just one element.
• Let C(n) denotes the number of times basic operation is executed. 
Then
 C(n) = 2C(n/2) + Cmerge(n) for n > 1
 C(1) = 0
where, Cmerge(n) is the number of key comparison made during the merging 
stage. In the worst case:
Cmerge(n) = 2 Cmerge(n/2) + n-1for n > 1 
Cmerge(1) = 0
• Solving the recurrence equation using master theorem: 
C(n) = 2C(n/2) + n-1 for n > 1
C(1) = 0
Here a = 2, b = 2
 f(n) = n, d = 1 
Therefore 2 = 2^1, case 2 holds
C(n) = Θ (n^d log n)
     = Θ (n^1 log n)
     = Θ (n log n)

# Advantages
• Number of comparisons performed is nearly optimal.
• Merge sort will never degrade to O(n2)
• It can be applied to files of any size

# Limitations
• Uses O(n) additional memory