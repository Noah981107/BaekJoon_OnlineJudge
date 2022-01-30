from sys import stdin

arr = list(map(int, stdin.readline().rstrip()))

arr.sort(reverse= True)

for value in arr :
    print(value, end = "")