n = int(input())  
arr = list(map(int, input().split()))
max = max(arr)

result = []
for score in arr :
    result.append(score/max *100)  
avg = sum(result)/n
print("%.2f" % avg)