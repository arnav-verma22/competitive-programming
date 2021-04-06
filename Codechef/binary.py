import math
def binary(x):
    bl = [0]*9
    while x != 0:
        y = math.trunc(math.log(x,2))
        bl[-y-1] = 1
        x = x - 2**y
    bl = list(map(str, bl))
    x = int("".join(bl))
    return x


for i in range(20):
    print(i, ' - ' ,binary(i))