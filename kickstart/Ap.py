def find_max_ap(mat):
    l = []
    l.append(mat[1])
    


for i in range(int(input())):
    mat = []
    row1 = list(map(int, input().split()))
    row2 = list(map(int, input().split()))
    row2.append(0)
    row2[1], row2[2] = row2[2], row2[1]
    row3 = list(map(int, input().split()))
    mat.append(row1)
    mat.append(row2)
    mat.append(row3)
    print(mat)