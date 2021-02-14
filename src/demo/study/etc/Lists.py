# Solving.01
n = int(input())
l = []
for _ in range(n):
    s = input().split()
    cmd, args = s[0], s[1:]
    if cmd !="print":
        cmd += "("+ ",".join(args) +")"
        eval("l."+cmd)
    else:
        print(l)



# Solving.02
n = int(input())
L = []

for i in range(n) :
    line = input().split()
    
    # 입력받은 line을 0번째[문자]와 그 뒤로 분리. input()은 기본적으로 Str형태로 문자를 받기 때문에 앞의 line[1]은 함수 명령어가 된다.
    # 이후 첫번째 if부터 마지막 elif까지를 한 블럭으로 만들어 조건에 해당되면 L에 담기도록 설정.
    command, number = line[0], line[1:]
    if command == "insert":
        L.insert(int(line[1]), int(line[2]))
    elif command == "remove":
        L.remove(int(line[1]))
    elif command == "append":
        L.append(int(line[1]))
    elif command == "sort":
        L.sort()
    elif command == "pop":
        L.pop()
    elif command == "reverse":
        L.reverse()
    elif command == "print":
        print(L)
