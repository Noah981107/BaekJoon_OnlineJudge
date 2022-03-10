from sys import stdin
from collections import deque

input = stdin.readline

n, m, v = map(int, input().split())
graph = [[] for _ in range(n+1)]
visited = [False] * (n+1)

def dfs(n) :
    print(n, end=" ")
    visited[n] = True
    for i in graph[n] :
        if not visited[i] :
            dfs(i)

def bfs(n):
    visited[n] = True
    queue = deque([n])
    while queue:
        v = queue.popleft()
        print(v, end= ' ')
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True

for _ in range(m) :
    v1, v2 = map(int, input().split())
    graph[v1].append(v2)
    graph[v2].append(v1)
    
for i in range(1, n+1) :
    graph[i].sort()
    
    
dfs(v)
visited = [False] * (n + 1)
print()
bfs(v)