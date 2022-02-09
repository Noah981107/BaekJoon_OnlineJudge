from sys import stdin
import heapq

N = int(stdin.readline())

heap = []

for _ in range(N) :
    
    x = int(stdin.readline().rstrip())
    
    if(x != 0) :
        heapq.heappush(heap, (abs(x), x))
    else :
        try:
            print(heapq.heappop(heap)[1])
        except:
            print(0)
                       