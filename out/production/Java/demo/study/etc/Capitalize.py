def solve(s) :
    # 입력된 문자열을 ' ' 단위의 String으로 나눠줍니다.
    s = s.split(' ')
    
    # capitalize를 통해 나눈 문자열의 첫 글자를 대문자로 만들어서 join함수로 합칩니다.
    return ' '.join([word.capitalize() for word in s])
