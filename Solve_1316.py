import sys

n = int(sys.stdin.readline())

count = n
for _ in range(n) :
    word = sys.stdin.readline().strip()
    for i in range(1, len(word)) :
        if word[i-1] == word[i] :
            pass
        elif word[i-1] != word[i] and word[i] in word[:i] :
            count -= 1
            break
        
print(count)
