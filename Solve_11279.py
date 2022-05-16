from sys import stdin
import heapq

input = stdin.readline
heap  = []
n = int(input())

for _ in range(n):
    number = int(input()) * -1
    
    if len(heap)==0 and number==0:
        print(0)
    elif number == 0:
        print(heapq.heappop(heap) * -1)
    else:
        heapq.heappush(heap, number)    