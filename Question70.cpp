#include <iostream>
using namespace std;

int main()
{
    int testCases;
    cin >> testCases;
    for (int t = 1; t <= testCases; t++) // for every testcase
    {
        int n, k;       // we are initialising n and k as int, as their maximum limit is 1e5
        cin >> n >> k;  
        if (k == n - 1) // if we put n-1 elements in correct position then there is no way we can put nth element in wrong position
        {
            cout << -1 << endl; // therefore we print -1
        }
        else
        {
            for (int i = 1; i <= n; i++)
            {
                if (i <= k) // we are printing exactly k good elements in the beginning
                {
                    cout << i; // we are putting i th element at i th position
                }
                else
                {
                    if (i == n) // we are putting the k+1 th element at the end of our permutaion
                    {
                        cout << k + 1;
                    }
                    else
                    {
                        cout << i + 1; // after the k good elements we are putting i+1 th element at i th position
                    }
                }
                cout << " ";
            }
        }
        cout << endl; // next line at the end of every testcase
    }
    return 0;
}