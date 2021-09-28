A, B ,N = map(int,input().split())
i = 0;

while i<=N :
    n = A//B
    A = (A%B) * 10
    i += 1

print(n)