import sys

n = int(sys.stdin.readline())

li = []
for i in range(n) :
    li.append(list(sys.stdin.readline().split()))

li.sort(key=lambda x: int(x[0]))

for value in li :
    print(value[0], value[1])