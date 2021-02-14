n = int(input())
student_marks = {}
for _ in range(n):
    name, *line = input().split()
    scores = list(map(float, line))
    student_marks[name] = sum(scores) / len(scores)
query_name = input()
print('%.2f'%student_marks[query_name])