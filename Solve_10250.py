def room_num(room) :
    if(room < 10) :
        room = '0'+str(room)
    return room

t = int(input())

for i in range(t):
    h, w, n = map(int, input().split())

    if n % h == 0:  
        room = room_num(n//h)
        floor = h
    else :
        room = room_num(n//h + 1)
        floor = n % h
    print('{}{}'.format(floor,room))