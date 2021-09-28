hour, minute = map(int, input().split())

if minute > 44 :
    print(hour,minute-45)
elif minute < 45 and hour > 0 :
    print(hour-1, minute+15)
else :
    print(23, minute+15)