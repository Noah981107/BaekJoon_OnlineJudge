from sys import stdin

input = stdin.readline

books = dict()

n = int(input())

for _ in range(n) :
    
    book = input()
    
    if book in books :
        books[book] += 1
    else :
        books[book] = 1
    
max_val = max(books.values())
arr = []

for key, value in books.items() :
    if value == max_val :
        arr.append(key)
    
arr.sort()
print(arr[0])