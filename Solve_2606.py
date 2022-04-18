from sys import stdin

input = stdin.readline

computer_num = int(input().rstrip())
connection_num = int(input())

network = [[]*computer_num for _ in range(computer_num+1)]

for _ in range(connection_num):
    a, b = map(int, input().rstrip().split())
    network[a].append(b)
    network[b].append(a)
    
visited = [0] * int(computer_num+1)

result = 0
def dfs(start) :
    visited[start] = 1
    global result
    for i in network[start]:
        if visited[i] == 0:
            dfs(i)
            result += 1
            
dfs(1)
print(result)