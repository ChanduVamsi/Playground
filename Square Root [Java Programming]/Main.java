import java.util.Scanner;  
class Main   
{  
    public static void main(String[] args)    
    {   
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  
        System.out.println(squareRoot(n));  
    }  

public static double squareRoot(int num)   
{  
    double prev;  
    double sqrt=num/2;  
  	do
    {
      prev = sqrt;
      sqrt = (prev + (num/prev))/2;
      
    }
  while((prev-sqrt)!=0);
    return sqrt;  
    }  
}  
