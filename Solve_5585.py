money = 1000-int(input())

remain = [500, 100, 50, 10, 5, 1]

count = 0
for value in remain :
    if(value<=money) :
        count += money // value
        money = money % value
    
print(count)