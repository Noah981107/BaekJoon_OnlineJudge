def sum(arr) :
    result = 0
    for i in range(len(arr)) :
        result += int(arr[i])
    return result

n = input()

mid = int(len(n)/2)

sum_first = sum(n[:mid])
sum_second = sum(n[mid:])

if(sum_first == sum_second) :
    print('LUCKY')
else :
    print('READY')
