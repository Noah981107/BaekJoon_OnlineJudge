import sys

t = int(sys.stdin.readline())

for _ in range(t) :
    k = int(sys.stdin.readline())
    n = int(sys.stdin.readline())
    floor0 = [x for x in range(1, n+1)]

    for i in range(k) :
        for j in range(1, n) :
            floor0[j] += floor0[j-1]
    print(floor0[-1])