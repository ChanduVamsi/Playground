#include<stdio.h>
#include<string.h>
int main()
{
 int i,flag=0;
 char str[100];
 gets(str);
 for(i=0;i<strlen(str);i++)
 {
  if(str[i]>='a' && str[i]<='z')
  {
   printf("%c",str[i]);
   flag=1;
   break;
  }
 }
 if(flag!=1)
 printf("");
     return 0;
}
