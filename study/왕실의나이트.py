import sys

location = sys.stdin.readline()
col = int(ord(location[0]) - int(ord('a'))) + 1
row = int(location[1])

moves = [(-2,1), (-2,1), (2,1), (2,-1), (1,2), (-1,2), (-1,-2), (1, -2)]

cnt = 0
for move in moves :
    nextCol = col + move[0]
    nextRow = row + move[1]

    if(nextCol>=1 and nextRow>=1 and nextRow<=8 and nextCol<=8) :
        cnt += 1

print(cnt)
    