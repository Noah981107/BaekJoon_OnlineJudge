from sys import stdin

input = stdin.readline

s = set()

for _ in range(int(input())) :
    name, status = input().split()
    
    if status == 'enter' :
        s.add(name)
    else :
        if name in s :
            s.remove(name)
        
result = sorted(s, reverse=True)

for name in result :
    print(name)