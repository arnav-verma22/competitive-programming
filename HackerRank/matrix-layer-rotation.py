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
    while j > l:
        matrix[i][j] = matrix[i][j-1]
        j -= 1
    while i > k:
        matrix[i][j] = matrix[i-1][j]
        i -= 1
    matrix[i+1][j] = temp

# Complete the matrixRotation function below.
def matrixRotation(matrix, r):
    # print(matrix)
    for z in range(r):
        rows = len(matrix)
        columns = len(matrix[0])
        i = 0
        j = 0
        while i < rows and j < columns:
            rotate(matrix, i, j, rows, columns)
            i += 1
            j += 1
            rows -= 1
            columns -= 1

    for row in matrix:
        print(*row, sep=' ')


if __name__ == '__main__':
    mnr = input().rstrip().split()

    m = int(mnr[0])

    n = int(mnr[1])

    r = int(mnr[2])

    matrix = []

    for _ in range(m):
        matrix.append(list(map(int, input().rstrip().split())))

    matrixRotation(matrix, r)

