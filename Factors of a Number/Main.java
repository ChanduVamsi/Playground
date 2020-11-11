import java.util.*;

class Main 
{ 

    public static void main(String[] args) 
    {

        int number = 60;
        for(int i = 1; i <= number; i++) 
        {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}