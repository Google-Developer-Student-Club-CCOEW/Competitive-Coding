'''
Question 27
___________

'''

r = 3   #rows
c = 3   #columns
import sys

def minC(blocks, m, n):
	if (n < 0 or m < 0):
		return sys.maxsize
	elif (m == 0 and n == 0):
		return blocks[m][n]
	else:
		return blocks[m][n] + min(minC(blocks, m-1, n), minC(blocks, m, n-1) )
def min(x, y):
	if (x < y):
		return x 
	else:
		return y 
blocks= [ [1, 2, 1],   #This is the input matrix
		[1, 4, 1],
		[2, 3, 1] ]

print(minC(blocks, 2, 2))
