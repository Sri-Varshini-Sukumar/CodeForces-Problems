import java.util.*;

public class DoremyPaint{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
			long n = sc.nextLong();
			long[] arr = new long[(int) n];
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextLong();
			}
			HashMap<Long,Long> hmp = new HashMap<>();
			
			for(long value : arr) {
				hmp.put(value, hmp.getOrDefault(value, 0L)+1);
			}
			
			if(hmp.size() >= 3) {
				System.out.println("NO");
			}else {
				long freq1 = hmp.values().iterator().next();
				long freq2 = (long) hmp.values().toArray()[hmp.size()-1];
				if(freq1 == freq2) {
					System.out.println("YES");
				}else if(n%2 == 1 && Math.abs(freq1-freq2) == 1) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		}
	}
}