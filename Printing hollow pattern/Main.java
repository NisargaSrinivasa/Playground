import java.util.Scanner;
class Main{
	public static void main (String[] args){
     	 Scanner in = new Scanner(System.in);
      int n = in.nextInt();
		int i,j;
for(i=1; i<=n; i++)
    {
        //Iterate over each column
        for(j=1; j<=n; j++)
        {
            if(i==1 || i==n || j==1 || j==n)
            {
                // Print star for 1st, 10th row and column
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
 
        // Move to the next line/row
       System.out.print("\n");
    }
    }
}
