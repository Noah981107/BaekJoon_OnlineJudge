from sys import stdin

while(True) :
    cnt = 0
    text = stdin.readline().rstrip()
    if(text == '#') :
        break
    else :
        for value in text :
            if value in 'aeiouAEIOU' :
                cnt += 1           
    print(cnt)