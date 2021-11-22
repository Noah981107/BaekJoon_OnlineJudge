from sys import stdin

def solution(n) :
    result = 1
    if n > 0 :
        result = n * solution(n-1)
    return result

n = int(stdin.readline())

print(solution(n))