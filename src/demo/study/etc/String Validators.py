# 입력받은 값을 리스트에 넣은 후 반복문을 통해 모든 method체크
text = input()
newList = [[c.isalnum(), c.isalpha(), c.isdigit(), c.islower(), c.isupper()] for c in text]


# zip과 *를 활용해 여러개의 한 번에 계산하기
rotated = list(zip(*newList))
print("\n".join([str(any(i)) for i in rotated]))
