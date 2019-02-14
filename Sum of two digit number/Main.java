import java.util.*;
class Main {
	public static void main (String[] args) 
    {
		Scanner in = new Scanner(System.in);
      int f,s,n=in.nextInt();
      s=n%10;
      f=n/10;
      System.out.println(s+f);
	}
}