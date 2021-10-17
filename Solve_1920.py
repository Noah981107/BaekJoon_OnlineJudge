from sys import stdin

n = stdin.readline()
arr = sorted(map(int,stdin.readline().split()))
m = stdin.readline()
target = map(int, stdin.readline().split())

def binary(value, arr, start, end):
    if start > end:
        return 0
    mid = (start+end)//2
    if value == arr[mid]:
        return 1
    elif value < arr[mid]:
        return binary(value, arr, start, mid-1)
    else:
        return binary(value, arr, mid+1, end)

for value in target:
    start = 0
    end = len(arr)-1
    print(binary(value,arr,start,end))