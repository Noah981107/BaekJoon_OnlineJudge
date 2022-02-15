from sys import stdin

input = stdin.readline

triangleNumbers = [n*(n+1)//2 for n in range(46)]

t = int(input())

def is_triangleNumber(number) :
    for i in range(1, 46) :
        for j in range(i, 46) :
            for k in range(j, 46) :
                if triangleNumbers[i] + triangleNumbers[j] + triangleNumbers[k] == number :
                    return 1
    return 0
    
for _ in range(t) :
    case = int(input())
    print(is_triangleNumber(case))