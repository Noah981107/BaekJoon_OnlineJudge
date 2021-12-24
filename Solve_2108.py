from sys import stdin
from collections import Counter

N = int(stdin.readline())

arr = []

for _ in range(N) :
    arr.append(int(stdin.readline()))
    
arr.sort()
    
print(round(sum(arr) / len(arr)))
print(arr[len(arr) // 2])

third = Counter(arr).most_common(2)
if len(arr) > 1 :
    if third[0][1] == third[1][1] :
        print(third[1][0])
    else :
        print(third[0][0])
else :
    print(third[0][0])
    
print(max(arr) - min(arr))