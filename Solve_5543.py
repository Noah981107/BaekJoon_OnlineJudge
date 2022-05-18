from sys import stdin

input = stdin.readline

hambuger = []
beverage = []

for i in range(5) :
    if i<3:
        hambuger.append(int(input()))
    else:
        beverage.append(int(input()))
        
print(min(hambuger) + min(beverage) - 50)