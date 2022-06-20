from sys import stdin

input = stdin.readline

n = input().rstrip()

result = 0

for value in n:
    result += int(value)**5
    
print(result)