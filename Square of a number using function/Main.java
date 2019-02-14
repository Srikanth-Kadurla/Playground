import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      n=sqr(n);
      System.out.print(n);
    }
  public static int sqr(int n)
  {
    return n*n;
	} 
}