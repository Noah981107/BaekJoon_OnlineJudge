from sys import stdin

myInput = stdin.readline

n, k = map(int, myInput().split())

people = [i for i in range(1, n+1)]
pt = 0
ans = []

for _ in range(n) :
    pt += k-1
    pt %= len(people)
    ans.append(people.pop(pt))
    
print(f"<{', '.join(map(str, ans))}>")
    

