from sys import stdin

input = stdin.readline

people_num = int(input().rstrip())
p1, p2 = map(int, input().rstrip().split())
relation_num = int(input().rstrip())
visited = [0] * (people_num+1)
graph = [[] * people_num for _ in range(people_num+1)]

for _ in range(relation_num):
    a, b = map(int, input().rstrip().split())
    graph[a].append(b) 
    graph[b].append(a)

print("전체 그래프 : ", graph)

def dfs(start):
    print("탐색하는 행 : ", graph[start])
    for node in graph[start]:
        if visited[node] == 0:
            visited[node] = visited[start]+1
            print("visited : ", visited)
            dfs(node)
    
dfs(p1)
if(visited[p2]>0):
    print(visited[p2])
else:
    print(-1)