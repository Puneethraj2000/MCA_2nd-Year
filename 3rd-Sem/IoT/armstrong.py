#Armstrong Number

num = input("Enter the number")
num1 = 0
for i in num:
	num1 += int(i)**len(num)
if num1 == int(num):
	print("Armstrong Number")
else:
	print("Not Armstrong Number")
