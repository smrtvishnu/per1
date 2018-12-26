#include <stdio.h>
#include<string.h>
int main(void) 
{
	char s[30];
	int n,i;
	
	scanf("%s",s);
	n=strlen(s);
	if(n%2==0)
	{
		s[n/2]='*';
		s[(n/2)-1]='*';
	}
	else
	{
		s[n/2]='*';
	}
	printf("\n%s",s);
	return 0;
}
