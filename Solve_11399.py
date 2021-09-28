n = int(input())
arr = list(map(int, input().split()))

arr.sort()

tmp = 0
result = 0
for i in range(n) :
    tmp += arr[i]
    result += tmp

print(result)