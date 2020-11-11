#include<stdio.h>
#include<string.h>
int main()
{
	int i,count=0;
	char c,str[100];
	gets(str);
	scanf("%c",&c);
	for(i=0;i<=strlen(str);i++)
	{
	    if(str[i]==c)
	    {
	        count++;
	    }
	}
	printf("%d\n",count);
    
}
