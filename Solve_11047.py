n, k = map(int, input().split())

arr = []
for i in range(n) :
    arr.append(int(input()))

arr.sort(reverse=True)
result = 0
for value in arr :
    result += k//value
    k = k%value
    
print(result)