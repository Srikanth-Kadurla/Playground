import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
       int n= in.nextInt();
       n=sum(n);
      System.out.print(n);
    }
    
    public static int sum(int n)
    {
      if(n%2==0)
        return (n+1)*(n/2);
      else
        return n*((n+1)/2);
    }
    
        
      
	
}