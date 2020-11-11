#include<stdio.h>

void patternPrint(int n)
{
    int i,j,print=1;
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            printf("%d",print);
        }
        printf("\n");
    }
}

int main()
{
    int a;
    scanf("%d",&a);
    patternPrint(a);
    return 0;
}
