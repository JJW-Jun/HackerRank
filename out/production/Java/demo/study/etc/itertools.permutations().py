# Source
https://www.hackerrank.com/challenges/itertools-permutations/problem
--------


from itertools import permutations

# Solving01.
x, y = input().split()
L = []

# 순열을 활용해 x라는 문자에서 y개를 순서대로 정렬
z = list(permutations(x, int(y)))


# 이후 이를 빈 리스트 L에 추가해서 문자열을 합친다.
for i in range(len(z)) :
    L.append(''.join(list(z[i])))

# 각각을 출
for i in sorted(L) :
    print(i)



# Solving02.
s,n = input().split()
print(*[''.join(i) for i in permutations(sorted(s),int(n))],sep='\n')
