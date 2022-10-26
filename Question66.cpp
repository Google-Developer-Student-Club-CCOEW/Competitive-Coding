/*

You are given a string s and a robot that currently holds an empty string t. Apply one of the following operations until s and t are both empty:

Remove the first character of a string s and give it to the robot. The robot will append this character to the string t.
Remove the last character of a string t and give it to the robot. The robot will write this character on paper.
Return the lexicographically smallest string that can be written on the paper.

Example 1:

Input: s = "zza"
Output: "azz"
Explanation: Let p denote the written string.
Initially p="", s="zza", t="".
Perform first operation three times p="", s="", t="zza".
Perform second operation three times p="azz", s="", t="".

*/

#include <bits/stdc++.h>
using namespace std;

char minchar(map<char,int>&m){
        for(auto &val : m){
            if(val.second>0) return val.first;
        }
        return 'a';
    }

void answer(string s){
        map<char,int>m;
        for(auto &val : s){
            m[val]++;
        }
        /*
        We created a stack 
        as it follows
        LIFO
        element is added at last and element is removed from first
        which states the question
        */
        stack<int>t;
        string ans="";
        for(auto &i:s){
            t.push(i);
            m[i]--;
            while(!t.empty() && t.top()<=minchar(m)){
                ans+=t.top();
                t.pop();
            }
        }
        while(!t.empty()){
            ans+=t.top();
            t.pop();
        }
        cout << ans << endl;
}

int main() {
    string s;
    cin >> s;
	answer(s);
	return 0;
}
