#include<stdio.h>

void selection_sort(int *a, int n)
{ 
   int i, j, min, temp;    
   for (i=0; i<n; i++)    
   {        
        min = i;        
        for (j=i+1; j<n; j++)        
        {            
        	if (a[j] < a[min])               
            min = j;        
        }        
        //WRITE DOWN CODE HERE   
     temp = a[min];
     a[min] = a[i];
     a[i] = temp;
    }
      for(i=0; i<n; i++)
   {       
    	 printf("%d ", a[i]);    
   }
 }

int main()
{
   int a[30], n;
   int i;    
   scanf("%d", &n);    
   for(i=0; i<n; i++) 
   {       
    	 scanf("%d", &a[i]);
   }    
   selection_sort(a,n);   
 
 }
