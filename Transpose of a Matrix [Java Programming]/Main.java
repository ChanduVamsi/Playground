import java.util.Scanner;
 class Main {

    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };
      int[][] transpose = new int[column][row];
      for(int i=0; i<column; i++)
      {
        for(int j=0;j<row;j++)
        {
          transpose[i][j] = matrix[j][i];
        }
      }
      display(transpose);
        
    }
  
    public static void display(int[][] matrix) {
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
    
   