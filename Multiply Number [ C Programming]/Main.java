#include<stdio.h>
int multiplyNumber(int a, int b, int c)
{ 
   int result, min, max, mid;
   max = (a>b)?((a>c)?a:c):((b>c)?b:c);
   min = (a<b)?((a<c)?a:c):((b<c)?b:c);
   mid = (a+b+c)-(min+max);
   result = (max*mid);
   return result;
}
int main()
{
   int a,b,c,ans;
   scanf("%d %d %d",&a,&b,&c);
   ans=multiplyNumber(a,b,c); 
   printf("%d",ans);
 
 }
