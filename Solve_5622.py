from sys import stdin

input = stdin.readline().rstrip()
result = 0
for value in input :
    if value in ['A', 'B', 'C'] :
        result += 3
    elif value in ['D', 'E', 'F'] :
        result += 4
    elif value in ['G', 'H', 'I'] :
        result += 5
    elif value in ['J', 'K', 'L'] :
        result += 6
    elif value in ['M', 'N', 'O'] :
        result += 7
    elif value in ['P', 'Q', 'R', 'S'] :
        result += 8       
    elif value in ['T', 'U', 'V'] :
        result += 9
    elif value in ['W', 'X', 'Y', 'Z'] :
        result += 10
        
print(result)