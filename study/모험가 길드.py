n = int(input())
arr = list(map(int, input().split()))
arr.sort()

count = 0
result = 0

for value in arr :
    count += 1
    if count >= value :
        result += 1
        count = 0

print(result)