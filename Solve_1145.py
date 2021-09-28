num = list(map(int,input().split()))

x = 1
count = 0
while True :
    for value in num :
        if(x%value == 0) :
            count += 1
    if(count >= 3) :
        break
    else :
        count = 0
        x += 1

print(x)