import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	    Scanner in = new Scanner(System.in);
      int i,j,n=in.nextInt();
      for(i=0;i<n;i++)
      {
        for(j=1;j<2*n;j++)
        {
          if(j<n-i||j>n+i)
            System.out.print(" ");
          else
            System.out.print("*");
        }
        System.out.println();
      }
                          
	}
}