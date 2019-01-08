n1=int(input("Enter the 1st number:"))
n2=int(input("Enter the 2nd number:"))
a=[]
b=[]
c=[]
for x in range(1,n1):
	if n1%x==0:
		a.append(x)
for x in range(1,n2):
	if n2%x==0:
		b.append(x)
for x in a:
	if x in b:
		c.append(x)
lcm=(n1*n2)//max(c)
print(lcm)
