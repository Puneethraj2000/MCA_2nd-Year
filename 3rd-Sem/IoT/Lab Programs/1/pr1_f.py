#Display the Divide By Zero Error using try and except block

n1 = float(input("Enter first number:"))
n2 = float(input("Enter second number:"))
try:
	res = "%.2f"%(n1/n2)
	print(n1,"/",n2,"=",res)
except:
	print("Divided by zero error")
	
#OR

try:
	n1=int(input("Enter first number"))
	n2=int(input("Enter second number"))
	print(n1/n2)
except ZeroDivisionError:
	print("Number must be greater than 0")
except ValueError:
	print("Please enter Integer value only")
