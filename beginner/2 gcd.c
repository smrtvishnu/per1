#include <stdio.h>
 
int main(void) 
{
	int n1,n2,i,gcd;
	scanf("%d %d",&n1,&n2);
	for(i=1 
;i<=n1 && i<=n2; ++i)
	//note that after initialisation of i it gets incremented and then enters the loop
	{
		if(n1%i==0 && n2%i==0)
		{
			gcd=i;
		}
	}
	printf("gcd=%d",gcd);
 
	return 0;
}
