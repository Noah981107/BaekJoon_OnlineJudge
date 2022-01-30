from sys import stdin

n = int(stdin.readline())

arr = list(map(int, stdin.readline().split()))

arr2 = sorted(list(set(arr)))

dic = {}
for i in range(len(arr2)) :
    dic[arr2[i]] = i

for i in arr :
    print(dic[i], end=" ")