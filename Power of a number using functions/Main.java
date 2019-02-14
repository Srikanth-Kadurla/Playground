import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in =new Scanner(System.in);
    int b=in.nextInt();
    int e=in.nextInt();
    System.out.print(pwr(b,e));
  }
  
  public static int pwr(int b,int e)
  {
    int i,r=1;
    for(i=1;i<=e;i++)
    {
      r=r*b;
    }
    return r;
  }
}