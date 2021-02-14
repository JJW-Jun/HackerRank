start = True
def solution(s) :
    s = s.lower()
    count, count_p, count_y = 0, 0, 0
    for i in range(len(s)):
        if s[i] == 'p':
            count_p += 1

        elif s[i] =='y' :
            count_y += 1

        else:
            pass

    if count_p == count_y:
        answer = True
        return answer

    else:
        answer = False
        return answer

print(solution('pPoooyY'))