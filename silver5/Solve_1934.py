import math
n = int(input())
while(n !=0) :
     a, b = map(int, input().split())
     gcd = math.gcd(a,b)
     print(int(gcd*(a/gcd)*(b/gcd)))
     n -= 1

