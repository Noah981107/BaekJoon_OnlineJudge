import sys

t = int(sys.stdin.readline())

for _ in range(t) :

    tmp = list(sys.stdin.readline())

    result = 0

    for value in tmp :
        if(value == '(') :
            result += 1
        elif(value == ')') :
            result -= 1

        if(result<0) :
            print("NO")
            break

    if(result > 0) :
        print('NO')
    elif(result == 0) :
        print('YES')