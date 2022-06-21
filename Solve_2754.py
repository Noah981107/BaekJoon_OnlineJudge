def solution(txt):
    if txt == 'A+':
        return 4.3
    elif txt == 'A0':
        return 4.0
    elif txt == 'A-':
        return 3.7
    elif txt == 'B+':
        return 3.3
    elif txt == 'B0':
        return 3.0
    elif txt == 'B-':
        return 2.7
    elif txt == 'C+':
        return 2.3
    elif txt == 'C0':
        return 2.0
    elif txt == 'C-':
        return 1.7
    elif txt == 'D+':
        return 1.3
    elif txt == 'D0':
        return 1.0
    elif txt == 'D-':
        return 0.7
    else:
        return 0.0
    
print(solution(input()))