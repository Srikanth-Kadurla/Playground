import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt(),f,s,t;
    t=n%10;
    s=(n/10)%10;
    f=n/100;
    n=(t*100)+(s*10)+f;
    System.out.println(n);
  }
}