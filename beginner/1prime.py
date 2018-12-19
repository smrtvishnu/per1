
no=raw_input()
flag=0
for i in range(2,no):
	if(no%i == 0):
		flag=1
		break
if(flag!=1):
	print("yes")
else:
	print("no")
