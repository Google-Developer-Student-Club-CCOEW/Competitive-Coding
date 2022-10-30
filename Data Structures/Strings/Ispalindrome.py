st = input()
st = st.lower()
rev = ""
for i in st:
    rev = i+rev
if(rev==st):
    print("Palindrome")
else:
    print("Not a Palindrome")
