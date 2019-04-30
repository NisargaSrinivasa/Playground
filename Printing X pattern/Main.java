import java.util.Scanner;
class Main {
	public static void main (String[] args){
       Scanner in = new Scanner(System.in);
     int n = in.nextInt();
      int i,j;
          for(i=0; i < n ;i++)
    {
        //4
        for(j=0; j < n ;j++)
        {
            //5
            if(i==j || j==(n-i-1))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        //6
        System.out.print("\n");
    }
  
}
}


	