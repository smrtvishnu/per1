#include<stdio.h>
void main()
{
    int a[100],i,j,n;
    printf("Enter the N:");
    scanf("%d",&n);
    printf("\n Enter the array:");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("\n The numbers are:");
    for(i=0;i<n-1;i++)
    {
        for(j=i;j<n;j++)
        {
            if(a[i]+a[j]==0)
            {
                printf("%d\t%d\n",a[i],a[j]);
            }
        }
    }
}
