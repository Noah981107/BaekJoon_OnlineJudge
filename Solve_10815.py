from sys import stdin

input = stdin.readline

n = int(input())
card = set(map(int, input().split()))
m = int(input())
myCard = list(map(int, input().split()))

for i in myCard:
    if i in card:
        print(1, end=' ')
    else:
        print(0, end=' ')