
import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       
        	pr(n);
    }
  public static void pr(int n)
  {
    int i,j,a;
    for(i=2;i<=n;i++)
    {
      a=0;
      for(j=2;j<i;j++)
      {
        if(i%j==0)
          a++;
      }
      
      if(a==0)
      {
        
       System.out.println(j); 
      }
    }
   
      
    
    }
}

