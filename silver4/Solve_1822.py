nA , nB = map(int, input().split())
A = set(map(int,input().split()))
B = set(map(int,input().split()))
result = A-B
result = list(result)
result.sort()
if(len(result)==0) :
    print(0)
else :
    print(len(result))
    for value in result :
        print(value,end=" ")
