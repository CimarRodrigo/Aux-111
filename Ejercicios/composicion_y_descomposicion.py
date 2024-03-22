import math

n = 123456

cd = int(math.log10(n)) + 1

componer = 0

while cd > 0:
    d = n // 10 ** (cd - 1)
    n = n % 10 ** (cd - 1)

    componer = componer * 10 + d

    cd = cd - 1
    print(d)
print(componer)