import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int s = 1 ; s <= n ; s++) {
			System.out.print(s);
           if (s%3==0 )
            System.out.print(",");
        }
  }
}