# solution 1
def split_and_join(line) :
    line = line.split(" ")
    return '-'.join(line)

# solution 2
def split_and_join(line) :
    print(*input('').split(" "), sep='-')