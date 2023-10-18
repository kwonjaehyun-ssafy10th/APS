import itertools

N, R = map(int, input().split())
graph = []
for _ in range(N):
    graph.append(list(map(int, input().split())))
port = []
iot = []
for r in range(N):
    for c in range(N):
        if graph[r][c] == 9:
            port.append((r, c))
        elif 1 <= graph[r][c] <= 3:
            iot.append((r, c))
flag = False
for i in range(1, min(len(port) + 1, 6)):
    for case in itertools.combinations(port, i):
        check = [1] * len(iot)
        for r, c in case:
            for j in range(len(iot)):
                if abs(r - iot[j][0]) + abs(c - iot[j][1]) - R - graph[iot[j][0]][iot[j][1]] <= 0:
                    check[j] = 0
        if sum(check) == 0:
            print(i)
            flag = True
            break
    if flag:
        break
if not flag:
    print(-1)
