from sys import stdin

n, m = map(int, stdin.readline().split())

set1 = set()
for i in range(n) :
    set1.add(stdin.readline().rstrip())
    
set2 = set()
for i in range(m) :
    set2.add(stdin.readline().rstrip())
    
li = sorted(list(set1 & set2))

print(len(li))

for value in li :
    print(value)