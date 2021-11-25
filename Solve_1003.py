from sys import stdin
       
t = int(stdin.readline())

for i in range(t) :
    
    n = int(stdin.readline())
    cnt0 = 1
    cnt1 = 0
    tmp = 0
    
    for _ in range(n) :
        tmp = cnt1
        cnt1 = cnt1 + cnt0
        cnt0 = tmp
        
    print(cnt0, cnt1)
        