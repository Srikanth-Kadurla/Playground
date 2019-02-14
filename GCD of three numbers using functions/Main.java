import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int g,n3=in.nextInt();
        
        g=gcd(n1,n2);
        g=gcd(g,n3);
      System.out.print(g);
      
	}
  
  public static int gcd(int a,int b)
  {
    int i,m;
    if(a>b)
      m=b;
    else
      m=a;
    for(i=m;i>=1;i--)
      if(a%i==0&&b%i==0)
       break;
    return i;
    
  }
}