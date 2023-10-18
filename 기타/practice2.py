import heapq

N = int(input())
graph = []
for _ in range(N):
    graph.append(list(map(int, input().split())))
edge = []
r = 0
c = 0
node = 0
edge_set = set()
cost_list = [0] + [N * N] * (N * N - 1)
for dr, dc in ((-1, 0), (0, 1), (1, 0), (0, -1)):
    nr = r + dr
    nc = c + dc
    if 0 <= nr < N and 0 <= nc < N:
        if (node, nr * N + nc) not in edge_set:
            if graph[r][c] == graph[nr][nc]:
                edge.append((1, node, (nr * N + nc)))
            elif graph[r][c] < graph[nr][nc]:
                edge.append(((graph[nr][nc] - graph[r][c]) * 2, node, (nr * N + nc)))
            else:
                edge.append((0, node, (nr * N + nc)))
            edge_set.add((node, nr * N + nc))
heapq.heapify(edge)

while edge:
    e = heapq.heappop(edge)
    prev_node = e[1]
    node = e[2]
    cost = e[0]
    if cost < cost_list[node]:
        cost_list[node] = cost
    edge_set.add((node, nr * N + nc))
    if node == N * N - 1:
        flag = False
        break
    r = node // N
    c = node % N
    for dr, dc in ((-1, 0), (0, 1), (1, 0), (0, -1)):
        nr = r + dr
        nc = c + dc
        if 0 <= nr < N and 0 <= nc < N:
            if (node, nr * N + nc) not in edge_set:
                if graph[r][c] == graph[nr][nc]:
                    edge.append((cost_list[node] + 1, node, (nr * N + nc)))
                elif graph[r][c] < graph[nr][nc]:
                    edge.append((cost_list[node] + (graph[nr][nc] - graph[r][c]) * 2, node, (nr * N + nc)))
                else:
                    edge.append((cost_list[node], node, (nr * N + nc)))
                edge_set.add((node, nr * N + nc))
                edge_set.add((nr * N + nc, node))
    heapq.heapify(edge)

print(cost_list[N * N - 1])
