#include<stdio.h>
int countElement(int arr[],int len,int n)
{
    int i,count=0;
    for(i=0;i<len;i++)
    {
        if(arr[i]>2*n)
        {
            count+=1;
        }
    }
    return count;
}

int main()
{
   int a,n;
   scanf("%d",&a);
   int arr[a];
   for(int i=0;i<a;i++)
   {
      scanf("%d",&arr[i]);
    }
   scanf("%d",&n);
   printf("%d",countElement(arr,a,n));
   return 0;
}
