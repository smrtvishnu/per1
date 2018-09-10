#include<stdio.h>
int main()
{
	int a=10,b=15,temp=0;
	a=a+b;
	b=a-b;
	a=a-b;
	printf(" AFTER SWAPPING a=%d b=%d",a,b);
}
