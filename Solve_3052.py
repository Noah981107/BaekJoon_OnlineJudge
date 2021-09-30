li = []

for i in range(10) :
    li.append(int(input())%42)

result = set(li)
print(len(result))