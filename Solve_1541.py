from sys import stdin

numbers = stdin.readline().rstrip().split('-')

arr = []

for number in numbers :
    cnt = 0
    value = number.split('+')
    for element in value : 
        cnt += int(element)
    arr.append(cnt)
    
result = arr[0]

for i in range(1, len(arr)) :
    result -= arr[i]

print(result)