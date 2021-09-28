import math
a, b = map(int,input().split())
print(math.gcd(a,b))
print(int(math.gcd(a,b)*(a/math.gcd(a,b))*(b/math.gcd(a,b))))
