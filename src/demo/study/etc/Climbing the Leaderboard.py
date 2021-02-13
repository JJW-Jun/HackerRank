# Source
https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem


n = int(input())
scores = list(map(int, input().split()))
m = int(input())
player = list(map(int, input().split()))

ranked = sorted(list(set(scores)), reverse=True)
l = len(ranked)

for i in player:
    while (l > 0) and (i >= ranked[l - 1]):
        l -= 1

    print(l + 1)
