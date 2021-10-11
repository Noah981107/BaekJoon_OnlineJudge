import sys

n = int(sys.stdin.readline())

li = []
for _ in range(n) :
    x, y = map(int, sys.stdin.readline().split())
    li.append((x,y))

li.sort()

for i in range(n) :
    print(li[i][0], li[i][1])