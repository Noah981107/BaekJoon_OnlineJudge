from sys import stdin
from itertools import permutations

input = stdin.readline

n, m = map(int,input().split())

li = [str(x) for x in list(range(1, n+1))]

for j in permutations(li, m) :
    print(' '.join(j))