from sys import stdin

input = stdin.readline
N, M = map(int ,input().split())
li = list(map(int, input().split()))

for i in range(N-1) :
    li[i+1] += li[i]

li = [0] + li

for _ in range(M) :
    start, end = map(int, input().split())
    print(li[end]-li[start-1])