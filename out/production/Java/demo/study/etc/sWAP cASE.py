def swap_case(s):
    # String은 immutable이기 때문에 리스트로 만들어서 mutable로 변환
    s = list(s)


    # 각각의 원소들을 순회하면서 대문자는 소문자로, 소문자는 대문자로 바꿔주고 그 외 경우는 pass
    for i in range(len(s)):
        if s[i].isupper():
            s[i] = s[i].lower()
        elif s[i].islower():
            s[i] = s[i].upper()

        else:
            pass

    # 원소들을 결합
    answer = ''.join(s)
    return answer