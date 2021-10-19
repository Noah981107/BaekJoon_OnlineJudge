from sys import stdin

c = int(stdin.readline())

for _ in range(c) :
    arr = list(map(int, stdin.readline().split()))
    studentNum = arr[0]
    average = sum(arr[1:]) / studentNum
    count = 0
    for value in arr :
        if value > average :
            count += 1
    result = count/studentNum * 100 
    print(f'{result:.3f}%')