from sys import stdin

input = stdin.readline

numA, numB = map(int, input().split())

a = set(list(map(int, input().split())))
b = set(list(map(int, input().split())))

print(len(a-b)+len(b-a))