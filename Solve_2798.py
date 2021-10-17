from sys import stdin

n, m = map(int, stdin.readline().split())

arr = list(map(int, stdin.readline().split()))

result = 0
for i in range(len(arr)) :
    for j in range(i+1, len(arr)) :
        for k in range(j+1, len(arr)) :
            tmp = arr[i] + arr[j] + arr[k] 
            if tmp > m :
                continue
            else :
                result = max(result, tmp)

print(result)