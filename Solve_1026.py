n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
result = 0

a.sort()

for i in range(n) :
    max_num = max(b)
    b[b.index(max_num)] = 0
    result += a[i] * max_num

print(result)