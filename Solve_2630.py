from sys import stdin

n = int(stdin.readline())

paper = []
for _ in range(n) :
    row = list(map(int, stdin.readline().rstrip().split()))
    paper.append(row)
    
result0 = []
result1 = []

def division(x, y, n) :
    now_color = paper[x][y]
    for i in range(x, x+n) :
        for j in range(y, y+n) :
            if now_color != paper[i][j] :
                division(x, y, n//2)
                division(x, y+n//2, n//2)
                division(x+n//2, y, n//2)
                division(x+n//2, y+n//2, n//2)
                return
    if now_color == 0 :
        result0.append(0)
    else :
        result1.append(0)
        
division(0, 0, n)
print(len(result0))
print(len(result1))