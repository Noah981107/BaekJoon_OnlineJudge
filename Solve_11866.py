from collections import deque
from sys import stdin

queue = deque()
result = []

n, k = map(int, stdin.readline().split())

for i in range(1, n+1):
    queue.append(i)

while queue:
    for i in range(k-1):
        queue.append(queue.popleft())
    result.append(queue.popleft())

print("<",end='')
for i in range(len(result)-1):
    print("%d, "%result[i], end='')
print(result[-1], end='')
print(">")