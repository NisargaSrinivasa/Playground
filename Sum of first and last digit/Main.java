import java.util.Scanner;

class Main {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
      if(num>10000)
      {
	    int sum =(num%10)+(num /10000);
      //  int a=sum+(num%10);
		System.out.println(sum);
      }
      else
        System.out.println("9");

	}
}