from sys import stdin
from collections import deque

myInput = stdin.readline

q = deque()

n = int(myInput())

for i in range(1, n+1) :
    q.append(i)
    
while(len(q) > 1) :
    q.popleft()
    secondCard = q.popleft()
    q.append(secondCard)
    
print(q.pop())
