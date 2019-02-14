import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
    	Scanner in = new Scanner(System.in);
      int a=1,i,j,n=in.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n;j++)
        {
         if(j<=n-i)
            System.out.print(" ");
          else
          {
            System.out.print(a+" ");
            a++;
          }
        }
        System.out.println();
      }
    }    
}