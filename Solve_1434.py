import sys

n , m = map(int, sys.stdin.readline().split())

boxs = list(map(int,sys.stdin.readline().split()))
books = list(map(int,sys.stdin.readline().split()))

print(sum(boxs)-sum(books))