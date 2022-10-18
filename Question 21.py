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