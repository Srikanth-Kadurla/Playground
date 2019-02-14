import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
      int i,j,n=in.nextInt();
      for(i=n;i>0;i--)
      {
        for(j=i;j>0;j--)
        {
         
            System.out.print(j);
        }
        System.out.println();
      }
                          
	}
}