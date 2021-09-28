case = 0
list = []

while(True) :
    case += 1
    result = 0
    l, p, v = map(int, input().split())
    if(l==0 and p==0 and v==0) :
        break
    n = v // p
    remain = v % p
    if(l < remain) :
        remain = l
    result = (n*l) + remain
    print("Case %d: %d" % (case, result))