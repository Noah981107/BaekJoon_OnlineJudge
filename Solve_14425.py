from sys import stdin

input = stdin.readline
result = 0
n, m = map(int, input().rstrip().split())
s = set()

for _ in range(n):
    s.add(str(input().rstrip()))
    
li = list(s)
    
for _ in range(m):
    if li.count(input().rstrip()) == 1:
        result += 1
          
print(result)