str = input().upper()
words = list(set(str))

li = []
for value in words :
    count = str.count(value)
    li.append(count)

if li.count(max(li)) > 1 :
    print("?")
else :
    max_idx = li.index(max(li))
    print(words[max_idx])