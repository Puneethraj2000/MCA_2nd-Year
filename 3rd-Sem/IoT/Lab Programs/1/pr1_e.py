#Display the name n times using while loop and for loop

name = input("Enter name:")
n1 = int(input("Enter the number for printing name"))
for i in range(n1):
	print(name)
	
	
name = input("Enter name:")
n2 = int(input("Enter the number for printing name"))
while n2 != 0:
	print(name)
	n2 -= 1
