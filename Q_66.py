import collections
class Solution:
  def robotWithString(self, s: str) -> str:
    ans = []
    count = collections.Counter(s)
    stack = []
    minChar = "a"

    for c in s:
      stack.append(c)
      count[c] -= 1
      while count[minChar] == 0 and minChar < "z":
          minChar = chr(ord(minChar) + 1)
      while stack and stack[-1] <= minChar:
        ans.append(stack.pop())

    return ''.join(ans + stack[::-1])

sol = Solution()
print(sol.robotWithString("zza"))