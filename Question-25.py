def sizeOfStr(s):
    return len(s) <= 4 or s != s[::-1]

def iter(s):
    checkQ = {i for i, x in enumerate(s) if x == '?'}
    st = []
    i = 0
    while i < len(s):
        if i in checkQ:
            s[i] = '0'
            st.append(i)
        while not (sizeOfStr(s[i-4:i+1]) and sizeOfStr(s[i-5:i+1])):
            if not st:
                return False
            i = st.pop()
            s[i] = '1'
        i += 1
    return True

def pali():
    n = int(input().strip())
    a = list(input().strip())
    return "POSSIBLE" if iter(a) else "IMPOSSIBLE"

for j in range(int(input())):
    print('Case #%d: %s' % (j+1, pali()))
