import java.util.Scanner;
class Main 
{   
    public static void main(String args[]) 
    {
        float p, r, t, sinterest;
        Scanner scan = new Scanner(System.in);
        p = scan.nextFloat();
        r = scan.nextFloat();
        t = scan.nextFloat();
        sinterest = (p * r * t) / 100;
        System.out.print(sinterest);
    } 
}