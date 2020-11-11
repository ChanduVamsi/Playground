#include<stdio.h>

int main()
{    
  int num,  rem,  temp, sum = 0;   
  scanf("%d",  &num);  
  temp = num;   
  while(num !=0)    
  {        
  	rem = num % 10;  
	sum = (sum*10) + rem; 
 	num /= 10;   
  }
  if(temp == sum)    
  {        
	printf("Palindrome");   
  }    
  else   
  {       
  	printf("Not Palindrome");   
  }  
  return 0;
} 
 

