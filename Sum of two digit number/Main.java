import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int mod=n%10;
      int div=n/10;
      {
        System.out.println(mod+div);
      }
	}
}