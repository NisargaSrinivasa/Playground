import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  
		int n = in.nextInt();
		for(int cur_row =1; cur_row <= 1; cur_row++) {
			for(int cur_col=1; cur_col <= 1; cur_col++) {
				if(cur_row == 1)
                {   if(n==6)
                  {
					System.out.print("*");
            System.out.print("\n");
					System.out.print("#*");
              System.out.print("\n");
					System.out.print("#*#");
          System.out.print("\n");
					System.out.print("*#*#");
          System.out.print("\n");
					System.out.print("*#*#*");
           System.out.print("\n");
					System.out.print("#*#*#*");
                  }
              else if(n==5)
              {
                System.out.print("*");
            System.out.print("\n");
					System.out.print("#*");
              System.out.print("\n");
					System.out.print("#*#");
          System.out.print("\n");
					System.out.print("*#*#");
          System.out.print("\n");
					System.out.print("*#*#*");
           System.out.print("\n");
                }
                }  
        } }
      

	}
}



   
