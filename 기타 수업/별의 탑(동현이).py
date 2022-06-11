num = int(input())
# 숫자 정수형()
pr = "*"
sp = ""
count = num
print((count-1)*" ","*")
for i in range(num-1):

    for k in range(count-2):
        sp += " "
    for j in range(2):
        pr += "*"
    print(sp,pr)
    count-=1
    sp = ""