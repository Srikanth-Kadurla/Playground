import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
      int i,j,n=in.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n;j++)
        {
          if(i==j||j==n-i+1)
            System.out.print("*");
          else 
            System.out.print(" ");
        }
        
        System.out.println();
      }
      
	}
}