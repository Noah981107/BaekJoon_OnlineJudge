import sys

n = int(sys.stdin.readline())

people = []
for _ in range(n) :
    x, y = map(int, sys.stdin.readline().split())
    people.append((x,y))

ranks = [1 for _ in range(len(people))]
for i in range(len(people)) :
    for j in range(i, len(people)) :
        if(people[i][0]<people[j][0] and people[i][1]<people[j][1]) :       
            ranks[i] += 1
        elif(people[i][0]>people[j][0] and people[i][1]>people[j][1]) :
            ranks[j] += 1

for rank in ranks :
    print(rank, end=" ")