import java.util.*;

public class LukeIsAFoodie {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Read the number of test cases
		while (t-- > 0) {
			long n = scanner.nextLong(); // Read the number of piles
			long x = scanner.nextLong(); // Read the maximum difference allowed
			long[] a = new long[(int) n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextLong(); // Read the size of each pile
			}

			// Create segments for each pile representing the range [a[i] - x, a[i] + x]
			long[][] segments = new long[(int) n][2];
			for (int i = 0; i < n; i++) {
				segments[i][0] = a[i] - x;
				segments[i][1] = a[i] + x;
			}

			long ans = 0; // Initialize the number of changes needed
			// Initialize the first segment's range
			long l = segments[0][0];
			long r = segments[0][1];
			for (int i = 1; i < n; i++) {
				// Update the current range to the intersection of the current segment
				l = Math.max(l, segments[i][0]);
				r = Math.min(r, segments[i][1]);
				// If the current range is invalid, increment the change counter
				if (l > r) {
					ans++;
					// Reset the range to the current segment
					l = segments[i][0];
					r = segments[i][1];
				}
			}
			System.out.println(ans); // Output the minimum number of changes needed
		}
		scanner.close();
	}
}