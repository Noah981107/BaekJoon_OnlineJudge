from sys import stdin
from itertools import combinations


input = stdin.readline

arr = []

for _ in range(9) :
    arr.append(int(input()))
    
for value in combinations(arr, 7) :
    tmp = sum(value)
    if tmp == 100 :
        for element in value :
            print(element)