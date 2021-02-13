num = [0]*1000

# Sloving01: num을 저장한 이유는 한 번 저장한 값을 불러올 때 신속하게 불러오기 위함.
def fac(n) :
    if n == 1 :
        return 1

    else :
        num[n-1] = n
        # print(num[n-1])
        return n * fac(n-1)