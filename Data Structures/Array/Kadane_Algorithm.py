'''Kadane's Algorithm is used to find the the maximum sum of a sub-array, 
it is an optimised approach to solve this problem with a time complexity of 
O(n) as compared to the brute force approch which will solve it in O(n^2)'''

def kadane_algorithm(array):
    max_sum = float('-inf')
    current_sum = 0
    for i in array:
      current_sum += i
      if current_sum > max_sum:
        max_sum = current_sum
      if current_sum < 0:
        current_sum = 0
    return max_sum
    '''
    >>>kadane_algorithm([-1,-8,-9,-20,-23,-4,-100,20,200,-1000,2000,-10000,20000,2000])
    22000
    >>>kadane_algorithm([-1,-8,-9,-20,-23,-4,-100,20,200,-1000,2000,-10000,20000])
    20000
    >>>kadane_algorithm([-1,-8,9,-20,23,-4,20])
    39
    >>>kadane_algorithm([-5,-8,-9,-6,-7])
    -5
    >>>kadane_algorithm([-5,-8,-9,-6,-7,8,10,20,32,-90,-8,23,-40,20,100])
    120
    '''
