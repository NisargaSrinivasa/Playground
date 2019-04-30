import java.util.Scanner;
class Main{
	public static void main (String[] args){
       int i,j,n;
     Scanner in = new Scanner(System.in);
		   n = in.nextInt();
int k=1;
   		for(i=1;i<=n;i++)
   		{
		for(j=1;j<=i;j++)
	   	System.out.print(k);
          	System.out.print("\n");
          k++;
	   
        }

	    
	}
}