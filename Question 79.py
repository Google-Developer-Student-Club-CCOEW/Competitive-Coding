def minimumSum(arr, n):
    while a in arr[i]:
        if a%2!=0:
            minSub=float('inf')
            curr=0
            for i in range(0,n):
                curr+=arr[i]
                if curr>arr[i]:
                    curr=arr[i]
                minSub=min(minSub,curr)
            return minSub
