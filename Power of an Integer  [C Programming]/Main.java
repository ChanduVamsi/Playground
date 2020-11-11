#include<stdio.h>
#include<stdlib.h>
int main()
{
    int i,j,num,power,temp;
    scanf("%d",&num);
    scanf("%d",&power);
    temp=num;
    if(num==0 && num==1)
        exit(0);
    while(num>1)
    {
        if(num%power!=0)
        {
            printf("Given number %d is not power of %d\n",temp,power);
            exit(0);
        }
        num=num/power;
    }
    printf("Given number %d is power of %d\n",temp,power);
    return 0;
}
