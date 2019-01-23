#include <stdio.h>
int main()
{
	int n,k,i,a[10];
	scanf("%d",&n);
	scanf("%d",&k);
	for(i=0;i<n;i++)
	{
	    scanf("%d",&a[i]);
	}
	printf("%d",a[k-1]);
	return 0;
}
