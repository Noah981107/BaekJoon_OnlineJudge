str = input()
result = 1
for i in range(len(str)) :
    if str[i] == '0' :
        result += int(str[i])
    else :
        result *= int(str[i])
print(result)

'''
str = input()

result = int(str[0])

for i in range(1, len(str)) :
    num = int(data[i])
    if num <= 1 or result <=1 :
        result += num
    else :
        result *= num

print(result)
'''