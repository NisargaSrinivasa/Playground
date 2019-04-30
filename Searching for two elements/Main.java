import java.util.*;
class Main{
  public static void main(String args[]){
     int c, n, search, flag,array[];
 
    Scanner in = new Scanner(System.in);
    
    n = in.nextInt();
    array = new int[n];
 
    for (c = 0; c < n; c++)
      array[c] = in.nextInt();
    search = in.nextInt();
   flag=in.nextInt();
    for (c = 0; c < n; c++)
    {
      if (array[c] == search)     /* Searching element is present */
      {
         System.out.print(c);
          break;
      }
   }
    System.out.print("\n");
     for (c = 0; c < n; c++)
    {
      if (array[c] == flag)     /* Searching element is present */
      {
         System.out.print(c);
          break;
      }
   }
   if (c == n)  /* Element to search isn't present */
      System.out.print("-1 ");
  }
}

