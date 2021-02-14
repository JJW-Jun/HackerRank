N = int(input())
for i in range(N) :
    try :
        x, y = map(int, input().split())
        result = x / y
        print(result)

    except ZeroDivisionError as e :
        print("Error Code : ", e)

    except ValueError as e :
        print("Error Code : ", e)