from sys import stdin

n = int(stdin.readline())

arr = []

for _ in range(n) :
    arr.append(int(stdin.readline()))
    
arr.sort()

for i in range(len(arr)) :
    print(arr[i])