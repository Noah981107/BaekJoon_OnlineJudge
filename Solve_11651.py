from sys import stdin

n = int(stdin.readline())

arr = []
for _ in range(n) :
    x, y = map(int, stdin.readline().split())
    arr.append((x,y))
    
arr.sort(key=lambda x : (x[1], x[0]))

for value in arr :
    print(value[0], value[1])