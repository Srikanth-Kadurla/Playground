import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
      int i,j,n=in.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n;j++)
        {
          if((i%2==1&&j==n)||(i%2==0&&j==1))
            System.out.print(i+1);
            else
              System.out.print(i);
        }
        System.out.println();
      }
             
	}
}