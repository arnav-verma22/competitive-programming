import math
import os
import random
import re
import sys


# Complete the matrixRotation function below.
def matrixRotation(matrix, r):
    mat = matrix[1:3][1:3]
    print(mat)
    print(matrix)
    rows = len(matrix)
    columns = len(matrix[0])




if __name__ == '__main__':
    mnr = input().rstrip().split()

    m = int(mnr[0])

    n = int(mnr[1])

    r = int(mnr[2])

    matrix = []

    for _ in range(m):
        matrix.append(list(map(int, input().rstrip().split())))

    matrixRotation(matrix, r)

