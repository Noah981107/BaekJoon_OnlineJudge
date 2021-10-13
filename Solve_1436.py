import sys

n = int(sys.stdin.readline())

start = 665
while(n>0) :
    start += 1
    if '666' in str(start) :
        n -= 1

print(start)