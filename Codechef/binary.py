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

def check_subseq(s, b):
    x = 0
    for i in b:
        if i in s:
            x = s.index(i) + 1
            s = s[x:len(s)]
        else:
            return False
    return True

for i in range(15):
    print(i, ' - ', binary(i), ' - ', check_subseq('1001011', str(binary(i))))
