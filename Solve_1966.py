from sys import stdin

t = int(stdin.readline())
for i in range(t):
    n, m = map(int, stdin.readline().split())
    arr = list(map(int, stdin.readline().split()))
    arr2 = [0 for i in range(n)]
    arr2[m] = 1
    cnt = 0
    while True:
        if arr[0] == max(arr):
            cnt += 1
            if arr2[0] == 1:
                print(cnt)
                break
            else:
                del arr[0]
                del arr2[0]
        else:
            arr.append(arr[0])
            del arr[0]
            arr2.append(arr2[0])
            del arr2[0]