from sys import stdin

input = stdin.readline

stick = [64, 32, 16, 8, 4, 2, 1]
cnt = 0
x = int(input())

for i in range(len(stick)):
    if x >= stick[i]:
        cnt += 1
        x -= stick[i]

    if x == 0:
        break
    
print(cnt)