import java.util.*;
public class TriangularNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {
			System.out.println("YES");
			
		}else if(n%3 == 0) {
			System.out.println("YES");
		}else System.out.println("NO");
		sc.close();
	}
}
