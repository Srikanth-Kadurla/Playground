import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	   Scanner in =new Scanner(System.in);
    
    int i,j,n=in.nextInt(); 
    for(i=1;i<=n;i++) 
    { 
      for(j=1;j<=n;j++) 
      { 
       System.out.print(i);
      } 
      System.out.println();
    } 
	}
}