from sys import stdin

k, n = map(int, stdin.readline().split())

lenCables = []

for _ in range(k) :
    lenCables.append(int(stdin.readline().rstrip()))
    
start, end = 1, max(lenCables)

while start <= end :
    mid = (start + end) // 2
    
    cnt = 0
    for value in lenCables :
        cnt += value // mid
    
    if cnt >= n :
        start = mid + 1
    else :
        end = mid-1
        
print(end)