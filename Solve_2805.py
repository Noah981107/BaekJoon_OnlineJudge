from sys import stdin

n, m = map(int, stdin.readline().split())
trees = list(map(int, stdin.readline().split()))
start, end = 1, max(trees)

while start <= end :
    mid = (start+end) // 2
    
    cnt = 0
    for i in trees :
        if i>=mid :
            cnt += i - mid
    
    if cnt >= m :
        start = mid+1
    else :
        end = mid-1
        
print(end)