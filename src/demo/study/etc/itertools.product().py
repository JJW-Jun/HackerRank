from itertools import product
A, B = list(map(int, input().split())), list(map(int, input().split()))
for i in list(product(A, B)) :
        print(i, end = ' ')