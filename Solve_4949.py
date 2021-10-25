import sys 


while 1: 
    input = sys.stdin.readline().rstrip() 
    stack = [] 
    true_flag = 1
    
    if input == '.': 
        break 
    
    for value in input: 
        if value == '(' or value == '[': 
            stack.append(value) 
        elif value == ')': 
            if stack and stack[-1] == '(': 
                stack.pop() 
            else : 
                true_flag = 0 
                break 
        elif value == ']': 
            if stack and stack[-1] == '[': 
                stack.pop() 
            else: 
                true_flag = 0 
                break
            
    print("yes" if true_flag and not(stack) else "no")
