/*
Question 53
___________

There are N+1 lights. Lights are placed at (0, 0), (1, 0), (2, 0) ... (N, 0). Initially all the lights are on. You want to turn off all of them one after one. You want to follow a special pattern in turning off the lights.

You will start at (0, 0). First, you walk to the right most light that is on, turn it off. Then you walk to the left most light that is on, turn it off. Then again to the right most light that is on and so on. You will stop after turning off all lights. You want to know how much distance you walked in the process. Note that distance between (a,0) and (b,0) is |a-b|.

Input
The first line of the input contains an integer T denoting the number of test cases. Each test case has a single integer N on separate line.

Output
For each test case, output the distance you walked.

Constraints
1 ≤ T ≤ 10^5
1 ≤ N ≤ 10^5
Sample 1:
Input
2
1
2
Output
2
5
*/

#include<bits/stdc++.h>
using namespace std;

int main(){
    long long int t, n, k;
    cin >> t;
    while(t--){
        cin >> n;
        k = ((n*(n+1))/2)+n;
        cout << k << endl;
    }
}
