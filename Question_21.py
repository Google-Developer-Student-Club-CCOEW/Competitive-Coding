'''
Question 21
___________

You are given a palindrome string P of length N consisting of only lowercase letters of the English alphabet. Find the shortest non-empty palindrome string Q such that P concatenated with Q forms a palindrome. Formally, the string PQ forms a palindrome.

Input
The first line of the input gives the number of test cases, T. T test cases follow. Each test case consists of two lines. The first line of each test case contains an integer N denoting the length of the string P. The second line of each test case contains a palindrome string P of length N.

Output
For each test case, output one line containing Case # x: y, where x is the test case number (starting from 1) and y is the non-empty palindrome string Q as described above.

Input
3
4
abba
4
cccc
6
cdccdc

Output:
Case # 1: abba
Case # 2: c
Case # 3: cdc
'''

def manacher(s):
    s = '^#' + '#'.join(s) + '#$'
    P = [0]*len(s)
    C, R = 0, 0
    for i in range(1, len(s)-1):
        i_mirror = 2*C-i
        if R > i:
            P[i] = min(R-i, P[i_mirror])
        while s[i+1+P[i]] == s[i-1-P[i]]:
            P[i] += 1
        if i+P[i] > R:
            C, R = i, i+P[i]
    return P

def matching_palindrome():
    N = int(input())
    P = input()
    p = manacher(P)
    l = min(p[i] for i in range(2, (len(p)-2)+1) if p[i] != 0 and p[1+p[i]] == p[i] and p[(len(p)-2)-(N-p[i])] == N-p[i])
    return P[:l]


def main():
    for case in range(int(input())):
        print('Case #%d: %s' % (case+1, matching_palindrome()))
if __name__=='__main__':
    main()
