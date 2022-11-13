# PROBLEM STATEMENT:
# Bubble Sort Algorithm.
# Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent
# elements if they are in the wrong order. This algorithm is not suitable for large data sets
# as its average and worst-case time complexity is quite high.
# 
# How does the Bubble Sort Algorithm work?
# Input: arr[] = {6,2,5,3,9}. Attempting ascending order sorting.
# On the first pass:
# the bubble sort starts with the first two elements and swaps them since 6>2.(6 2 5 3 9) -> (2 6 5 3 9)
# Then, (2 6 5 3 9) -> (2 5 6 3 9), this swap occurs because 6>5.
# Then, (2 5 6 3 9) -> (2 5 3 6 9), this swap occurs because 6>3.
# Then, (2 5 3 6 9) -> (2 5 3 6 9), here since 9>6 no swap occurs.
# On the second pass:
# (2 5 3 6 9) -> (2 5 3 6 9), no swap
# (2 5 3 6 9) -> (2 3 5 6 9), swap occurs because 5>3.
# (2 3 5 6 9) -> (2 3 5 6 9), no swap
# (2 3 5 6 9) -> (2 3 5 6 9), no swap
# Now, the third pass:
# The array is already sorted, but our algorithm doesn't know that it is completed.
# The algorithm needs one whole pass without swap to know that it is sorted. 
# (2 3 5 6 9) -> (2 3 5 6 9), no swap
# (2 3 5 6 9) -> (2 3 5 6 9), no swap
# (2 3 5 6 9) -> (2 3 5 6 9), no swap
# (2 3 5 6 9) -> (2 3 5 6 9), no swap

def bubbleSort(arr):
    n = len(arr)
    # Read through the entire list of elements.
    for i in range(n): 
        for j in range(0, n-i-1):
            # Run through array from 0 to n-i-1
            # Swap the elements if the (j)th locations has greater value
            # than the next element
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
# A code with test input to verify the above function of Bubble Sorting.
if __name__ == "__main__":
  arr = [64, 34, 25, 12, 22, 11, 90]
 
  bubbleSort(arr)
 
  print("Sorted array is:")
  for i in range(len(arr)):
      print("%d" % arr[i], end=" ")