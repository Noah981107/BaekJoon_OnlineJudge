from sys import stdin

croatia = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
word = stdin.readline().rstrip()

for i in croatia :
    word = word.replace(i, '*')  
print(len(word))