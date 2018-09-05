#include <stdio.h>
int div(int);
int main()
{ 
    int n,c;
    scanf("%d",&n);
    c=div(n);
    printf("%d",c);
	return 0;
}
int div(int num)
{
    if(num%2==0)
    {
        num=num/2;
        return div(num);
    }
    else
    {
        return num;
    }
    
}
