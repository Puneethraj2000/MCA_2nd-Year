#Display the specified month of current year

import calendar as cal
import datetime as dt

year = str(dt.datetime.now())[:4]

month = int(input("Enter the month:"))
if month in range(1,13):
	print(cal.month(int(year),month))
else:
	print("Invalid month")
	
#OR

y = int(input("Enter year:"))
m = int(input("Enter month:"))
print(cal.month(y,m))
