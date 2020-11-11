import java.util.*;

class Main {
	public static void main (String[] args) {
	 Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int value=sc.nextInt();
       int arr[]=new int[n];
        for(int i=0; i<n;i++)
         {            
            arr[i]=sc.nextInt();
         }
         int ans=occurrence(arr,value);
         if(ans>0){
             System.out.println(ans);
         }
         else
            System.out.println("No Occurrence Found");
	}


	static int occurrence(int[] arr, int value) {
		{
			int i = 0, count=0, len = arr.length;
			while(i < len)
			{
				if(arr[i] == value)
				     count++;
                i++;
			}
			return count;
		  }
	}
}
