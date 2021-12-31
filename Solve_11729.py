from sys import stdin

n = int(stdin.readline())

def solution(n, a, b, c):
    if n == 1:
        print(a, c)
    else:
        solution(n - 1, a, c, b)
        print(a, c)
        solution(n - 1, b, a, c)

sum = 1

for i in range(n - 1):
    sum = sum * 2 + 1

print(sum)
solution(n, 1, 2, 3)