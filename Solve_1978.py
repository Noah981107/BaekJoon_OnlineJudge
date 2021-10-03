n = int(input())

arr = list(map(int, input().split()))

result = 0
for value in arr :
    count = 0
    for i in range(1, value+1) :
        if(value % i == 0) :
            count += 1
    if(count == 2) :
        result += 1

print(result)