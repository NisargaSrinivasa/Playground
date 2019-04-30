import java.util.Scanner;
class Main{
  public static void main(String args[]) {
   Scanner in = new Scanner(System.in);
    char ch = in . next().charAt(0);
    int key = in.nextInt();
    if(ch=='T') 
    {
       System.out.print("R");
    } 
    else
    { 
       System.out.print("z");
    }
  }
}