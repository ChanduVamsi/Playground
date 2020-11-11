#include<stdio.h>
#include<string.h>

int Checkbirthday(int a,char b[])
{ 
 
  int currentdate=a;    
  scanf("%d",&currentdate);    
  char currentmonth[100];    
  scanf("%s",currentmonth); 
  if((a==currentdate)&&(strcmp(b,currentmonth)==0))
  {        
    return 0;    
  }    
  else    
  {        
    return 1;    
  }
}

int main()
{
   int date;    
   scanf("%d",&date);    
   char month[100];    
   scanf("%s",month);     
   if((Checkbirthday(date,month)==0))    
   {        
	printf("HE/SHE's BIRTHDAY");    
   }    
   else    
   {        
	printf("NO");    
   }    
}
