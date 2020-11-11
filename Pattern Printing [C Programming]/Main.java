#include<stdio.h>
#include<stdlib.h>
int main()
{
    
    int i,j,k,rows,count;
    scanf("%d",&rows);
    count=rows;
    for(i=1;i<=rows;i++)
    {
        for(k=1;k<count;k++)
        {
            printf(" ");
        }
        for(j=1;j<=i;j++)
        {
            printf("*");
        }
        count--;
        printf("\n");
    }
    count=1;
    for(i=rows-1;i>=1;i--)
    {
         for(k=1;k<=count;k++)
        {
            printf(" ");
        }
        for(j=1;j<=i;j++)
        {
            printf("*");
        }
        count++;
        printf("\n");
    }
    
}

