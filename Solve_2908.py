a, b = input().split()

tmp1 = list(a)
tmp2 = list(b)

str1 = str(tmp1[2]) + str(tmp1[1]) + str(tmp1[0])
str2 = str(tmp2[2]) + str(tmp2[1]) + str(tmp2[0])

if(int(str1)>int(str2)) :
    print(str1)
else :
    print(str2)