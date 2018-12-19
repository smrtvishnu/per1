#include<stdio.h>
int main()
{
	int a[100],n,i,j,k,b[100];
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
		for(j=1;j<n;j++)
		{
			if(a[j-1]<a[j])
			{
				k=a[j-1];
				a[j-1]=a[j];
				a[j]=k;
			}
		}
	}
	k=0;
	for(i=n-1;i>=0;i--)
	{
		b[i]=a[k];
		k++;
	}
	k=0; 
	j=0;
	for(i=0;i<n;i++)
	{
		if(i%2==0)
		{
		   
			printf("%d ",a[k]);
			k++;
		}
		else
		{
			printf("%d ",b[j]);
			j++;
		}
	}
}
