import math
import os
import random
import re
import sys

def rotate(matrix, k, l, r, c):
    i = k
    j = l
    temp = matrix[i][j]
    while j < c - 1:
        matrix[i][j] = matrix[i][j+1]
        j += 1
    while i < r - 1:
        matrix[i][j] = matrix[i+1][j]
        i += 1
    while j > 0:
        matrix[i][j] = matrix[i][j-1]
        j -= 1
    while i > 0:
        matrix[i][j] = matrix[i-1][j]
        i -= 1
    matrix[i+1][j] = temp

# Complete the matrixRotation function below.
def matrixRotation(matrix, r):
    mat = matrix[1:3][1:3]
    print(mat)
    print(matrix)
    rows = len(matrix)
    columns = len(matrix[0])

    i = 0
    j = 0
    temp = matrix[0][0]
    while j < columns - 1:
        matrix[i][j] = matrix[i][j + 1]
        j += 1
    while i < rows - 1:
        matrix[i][j] = matrix[i + 1][j]
        i += 1
    while j > 0:
        matrix[i][j] = matrix[i][j - 1]
        j -= 1
    while i > 0:
        matrix[i][j] = matrix[i - 1][j]
        i -= 1
    matrix[i + 1][j] = temp

    print(matrix)


if __name__ == '__main__':
    mnr = input().rstrip().split()

    m = int(mnr[0])

    n = int(mnr[1])

    r = int(mnr[2])

    matrix = []

    for _ in range(m):
        matrix.append(list(map(int, input().rstrip().split())))

    matrixRotation(matrix, r)

