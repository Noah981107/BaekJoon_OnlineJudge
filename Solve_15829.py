from sys import stdin
import math

L = int(stdin.readline())

txt = stdin.readline()

result = 0
for i in range(len(txt)-1) :
    value = ord(txt[i])-ord('a') + 1
    result += (value * pow(31,i))
    
print(result % 1234567891)