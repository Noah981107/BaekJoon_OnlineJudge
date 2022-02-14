from sys import stdin
import heapq

input = stdin.readline

n = int(input())

hq = []

for _ in range(n) :
    number = int(input())
    
    if(number == 0) :
        print(heapq.heappop(hq)[1] if len(hq) else 0)
    else :
        heapq.heappush(hq, (abs(number), number))