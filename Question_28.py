def maximumMoney(arr, k):
    length = len(arr)
    Max = 0
    for i in range(0,k+1):
        sum = 0
        for j in range(0,i):
            sum += arr[j]
        for p in range(length-k+i,length):
            sum += arr[p]
        
        if(sum>Max):
            Max = sum
    
    print(Max)
 
maximumMoney([3, 14, 23, 25, 50, 60, 2], 3)