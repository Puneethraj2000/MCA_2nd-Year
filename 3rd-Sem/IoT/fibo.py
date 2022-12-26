#Fibonacci Series

f1 = 0
f2 = 1
n = int(input("Enter the number greater than zero:"))
if(n <= 0):
	print("Enter the number greater than zero")
elif(n == 1):
	print(f1)
elif(n == 2):
	print(f1,f2)
else:
	print("{} {}".format(f1,f2),end=" ")
	for i in range(n-2):
		f3 = f1+f2
		print("{}".format(f3),end=" ")
		f1=f2
		f2=f3
	print()
