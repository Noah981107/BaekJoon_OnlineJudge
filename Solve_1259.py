def check(x) :
    left = []
    right = []

    for i in range(len(x)) :
        left.append(x[i])
    
    for i in reversed(range(len(x))) :
        right.append(x[i])

    if left == right :
        return True
    else :
        return False
    

while True :

    a = input();
    if(a=='0') :
        break

    if check(a) == True :
      print('yes')
    else :
     print('no')

