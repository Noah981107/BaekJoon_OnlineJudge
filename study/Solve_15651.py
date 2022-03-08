from sys import stdin
from itertools import product

input = stdin.readline

N, M = map(int, input().split())

numbers = [i for i in range(1, N+1)]

for num in product(numbers, repeat=M) :
    for i in num :
        print(i, end = " ")
    print()    