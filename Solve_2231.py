n = int(input())

result = 0
for i in range(1, n+1) :
    numbers = list(map(int, str(i)))
    sum_numbers = i + sum(numbers)
    if(sum_numbers==n) :
        result = i
        break

if(result == 0) :
    print(0)
else :
    print(result)