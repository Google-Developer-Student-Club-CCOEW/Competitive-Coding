#include <bits/stdc++.h>
using namespace std;
int main()
{
    int N = 10;
    int arr[N] = {2, 10, 1, 12, 6, 13, 5, 7, 15, 16};
    
    for (int i = 1; i < N; i++)     // start comparing with index = 0 element, that's why it's not included in loop
    {
        int temp = arr[i];
        int j = i - 1;
        for (j; j >= 0; j--)
        {
            if (arr[j] > temp)
            {
                // shifting the greater values
                arr[j + 1] = arr[j];
            }
            else
            { // break after reaching to smaller number
                break;
            }
        }
        // copy temp value at specific position
        arr[j + 1] = temp;
    }

    for (int i = 0; i < N; i++)
    {
        // printing the sorted array
        cout << arr[i] << " ";
    }

    return 0;
}
