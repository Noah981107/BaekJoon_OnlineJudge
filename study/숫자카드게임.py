N, M = map(int, input().split())
matrix = []
result = []
for i in range(N) :
        matrix.append(list(map(int,input().split())))

for i in range(N) :
    result.append(min(matrix[i]))

print(max(result))


