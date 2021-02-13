def mutate_string(string, position, character):
    text = str(string)
    a, b = int(position), str(character)
    answer = text[:a] + b + text[a+1:]
    return answer