from collections import Counter

n = int(input())
books = []
for _ in range(n) :
    books.append(input())

books.sort()

counter = Counter(books)
print(counter.most_common(1)[0][0])


