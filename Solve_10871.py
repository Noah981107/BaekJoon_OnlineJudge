n, x = map(int, input().split())
li = list(map(int, input().split()))

for i in range(len(li)) :
    if li[i] < x :
        print(li[i], end = " ")