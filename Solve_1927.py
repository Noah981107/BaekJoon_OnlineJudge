from sys import stdin
import heapq

input = stdin.readline
heap  = []
n = int(input())

for _ in range(n):
    number = int(input())
    
    if len(heap)==0 and number==0:
        print(0)
    elif number == 0:
        print(heapq.heappop(heap))
    else:
        heapq.heappush(heap, number)        