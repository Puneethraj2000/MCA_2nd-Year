m1=int(input("Enter a first mark : "))
m2=int(input("Enter a second mark : "))
m3=int(input("Enter a third mark : "))
lst=[m1,m2,m3]
lst.sort()
res=(lst[1]+lst[2])/2
print("Large numbers are",lst[1], "and" ,lst[2] ,"sum of that numbers", lst[1]+lst[2])
print("Average of 2 large numbers : ",res)
