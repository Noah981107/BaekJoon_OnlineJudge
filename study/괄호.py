from sys import stdin

myInput = stdin.readline

T = int(myInput())

for _ in range(T) :
    
    txt = myInput().rstrip()
    
    stack = []
    result = "YES"
    
    for value in txt :
        if value == '(' :
            stack.append(value)
        else :
            if len(stack) > 0 :
                stack.pop()
            else :
                result = "NO"
    
    if len(stack) > 0 :
        result = "NO"
    
    print(result)