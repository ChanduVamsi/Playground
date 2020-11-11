#include<stdio.h>
#include<string.h>

int isprime(int num){  
  int i; 
  int isprime = 1;
  for(i = 2;  i < num; i++) {      
 	 if(num % i == 0){             
           isprime = 0;          
           break;     
   	 } 
   }    
   return isprime;
 }


int is_prime_num_has_cons_sum_fact(int num){
    int prime_num[100], i, j, isFound = 0, sum =0;
    int prime_num_idx = 0;
    for(i = 2; i < num; i++){  
        if(isprime(i) == 1){
            prime_num[prime_num_idx] = i;
            prime_num_idx++;
        }
    }
    for(i = 0; i < prime_num_idx; i++){   
        sum = 0;
        for(j = i; j < prime_num_idx; j++){
            sum = sum + prime_num[j];
            if(sum == num){
               return 1;
            }
        }
    }
    return 0;
}

    

void main()
{    
  int n, m;    
  scanf("%d", &n);
  for(m=2; m<=n; m++)
  {
      if(isprime(m) && is_prime_num_has_cons_sum_fact(m))
      {
	      printf("%d ", m);
      }
  } 
}
