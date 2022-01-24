from sys import stdin

# N = 포켓몬의 개수
# M = 내가 맞춰야 하는 문제의 개수
N, M = map(int, stdin.readline().split())


dict = {}

for i in range(1, N + 1):
    a = input().rstrip()
    dict[i] = a
    dict[a] = i

for i in range(M):
    quest = input().rstrip()
    if quest.isdigit():
        print(dict[int(quest)])
    else:
        print(dict[quest])