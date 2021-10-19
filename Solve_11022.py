from sys import stdin

t = int(stdin.readline())

for i in range(1, t+1) :
    x, y = map(int, stdin.readline().split())
    print('Case #%d: %d + %d = %d' % (i, x, y, x+y))