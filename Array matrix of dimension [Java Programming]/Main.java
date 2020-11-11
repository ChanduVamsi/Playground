
import java.util.*;

class Main {
    
static int calculateMatrixSum(int matrix[][], int m, int n) 
{   int sum=0;
	int i,j,row=m, column=n;
    if((row>0)&&(column>0))
    {
        for(i=0;i<row;i++)
        {
		for(j=0;j<column;j++)
            {
                if(i==j)
                {
                    if( matrix[i][j] % 2 != 0)
                    	sum+=matrix[i][j];
                }
            }
        }
    }
    return sum; 
} 
	public static void main (String[] args) {
	 Scanner sc=new Scanner(System.in);
       int rows=sc.nextInt();
       int columns=sc.nextInt();
       int twoD[][]=new int[rows][columns];
        for(int i=0; i<rows;i++)
         {            
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=sc.nextInt();
            }
         }
         System.out.println(calculateMatrixSum(twoD,rows,columns));
	}
}