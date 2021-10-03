import sys

n = int(sys.stdin.readline())

deque = []
for _ in range(n) :
    tmp = sys.stdin.readline().split()

    if(tmp[0]=='push_front') :
        deque.insert(0, tmp[1])
    elif(tmp[0] == 'push_back') :
        deque.append(tmp[1])
    elif(tmp[0] == 'pop_front') :
        if(len(deque) == 0) : print(-1)
        else : print(deque.pop(0))
    elif(tmp[0]=='pop_back') :
        if(len(deque)==0) : print(-1)
        else : print(deque.pop(-1))
    elif(tmp[0] == 'size') :
        print(len(deque))
    elif(tmp[0] == 'empty') :
        if(len(deque)==0) : print(1)
        else : print(0)
    elif(tmp[0]=='front') :
        if(len(deque)==0) : print(-1)
        else : print(deque[0])
    elif(tmp[0]=='back') :
        if(len(deque)==0) : print(-1)
        else : print(deque[-1])