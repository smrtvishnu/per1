st1=input("Enter the brackets:")
a=[]
if st1[0]==')' or st1[len(st1)-1]=='(':
	print("Not valid")
elif st1.count('(')!=st1.count(')'):
      print("Not valid")
else:
    l=len(st1)
    for x in range(l):
        if st1[x]=='(':
            a.append(st1[x])
        elif st1[x]==')' and len(a)!=0:
            if a[len(a)-1]=='(':
                a.pop()
    if len(a)==0:
        print("Valid")
    else:
        print("Invalid")
