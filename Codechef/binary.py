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

def check_subseq(str1, str2, m, n):
    if m == 0:
        return True
    if n == 0:
        return False;
 
    if str1[m - 1] == str2[n - 1]:
        return check_subseq(str1, str2, m - 1, n - 1)
 
    return check_subseq(str1, str2, m, n - 1)

for i in range(15):
    print(i, ' - ', binary(i), ' - ', check_subseq(str(binary(i)), '1001011',len(str(binary(i))) , len('1001011')))
