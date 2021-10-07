n = input()

arr = []
num = 0
for value in n :
    if value.isalpha() :
        arr.append(value)
    else :
        num += int(value)

arr.sort()

if value != 0 :
    arr.append(str(num))

print(''.join(arr))
