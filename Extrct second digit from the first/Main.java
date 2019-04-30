import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
      int sum;
      if(num>999)
      {  sum = (num /1000);}
      else
       sum=(num/1);
      sum=sum%10;
		System.out.println(sum);
	}
}