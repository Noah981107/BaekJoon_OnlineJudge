from sys import stdin

input = stdin.readline

N = int(input())
roads = list(map(int, input().split()))
cities = list(map(int, input().split()))

minVal = cities[0]
result = 0
for i in range(N-1):
    if minVal > cities[i]:
        minVal = cities[i]
    result += (minVal * roads[i])
    
print(result)