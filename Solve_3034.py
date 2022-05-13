from sys import stdin
from math import sqrt, pow

input = stdin.readline

n, w, h = map(int, input().split())

for _ in range(n):
    matches = int(input())
    if matches>sqrt(pow(w,2)+pow(h,2)):
        print("NE")
    else:
        print("DA")