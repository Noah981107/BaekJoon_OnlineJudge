M = int(input())
N = int(input())
abc = []
for i in range(M,N+1) :
    count = 0
    for j in range(1,i+1) :
        if(i%j==0) :
            count += 1
            if count > 2 :
                break
    if(count == 2) :
        abc.append(i)
if len(abc) != 0 :
    print(sum(abc))
    print(min(abc))
else :
    print("-1")
