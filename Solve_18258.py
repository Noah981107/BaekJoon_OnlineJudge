from sys import stdin
from collections import deque

input = stdin.readline

N = int(input())
queue = deque([])

for _ in range(N) :
    
    txt = input().split()
    
    if txt[0] == "push" :
        queue.append(txt[1])
    elif txt[0] == "pop" :
        if not queue :
            print(-1)
        else :
            print(queue.popleft())    
    elif txt[0] == "size" :
        print(len(queue))
    elif txt[0] == "empty" :
        if not queue :
            print(1)
        else :
            print(0)
    elif txt[0] == "front" :
        if not queue :
            print(-1)
        else :
            print(queue[0])
    elif txt[0] == "back" :
        if not queue :
            print(-1)
        else :
            print(queue[-1])