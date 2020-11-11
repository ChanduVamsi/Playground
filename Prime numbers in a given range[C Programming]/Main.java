#include<stdio.h>
int isprime(int n)
{
  for(int i=2; i<n; i++)
  {
    if(n%i==0)
      return 0;
  }
  return 1;
}
void print(int a, int b)
{
    int i;
    for(i=a;i<=b;i++)
    {
        if(isprime(i)==1)
            printf("%d ",i);
    }
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    print(a,b);
    return 0;
}
