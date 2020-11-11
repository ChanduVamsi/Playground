#include<iostream>
#include<stdlib.h>
#include<string.h>
using namespace std;

void consonants(char *str)
{
    for(int i=0; i<strlen(str); i++)
    {
         								
			if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o' || str[i]=='u'||str[i]=='A'||str[i]=='E'
					||str[i]=='I'||str[i]=='O'||str[i]=='U')
            {
                continue;           
            }
            else
                printf("%c",str[i]);
        
    }
}

int main()
{
    char str[100];
    scanf("%s",str);
    consonants(str);
    return 0;
}


