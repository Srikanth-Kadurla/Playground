import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int m,n3=in.nextInt();
        
        m=max(n1,n2);
        if(n3>m)
          System.out.print(n3);
      else
        System.out.print(m);
      
	}
  
  public static int max(int a,int b)
  {
    if(a>b)
      return a;
    else return b;
  }
}