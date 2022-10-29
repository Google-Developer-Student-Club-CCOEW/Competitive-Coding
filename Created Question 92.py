def utopianTree(n):
    height = 1
    period = 0
    while period<n:
        if height%2 != 0:
            height *= 2
        else:
            height +=1
        period +=1
    return height
