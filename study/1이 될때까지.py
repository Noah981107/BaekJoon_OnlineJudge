n, k = map(int,input().split())

count = 0

while True :
    if n == 1 :
        break
    if n % k  != 0 :
        count += 1
        n -= 1
    else :
        count += 1
        n //= k

print(count)
