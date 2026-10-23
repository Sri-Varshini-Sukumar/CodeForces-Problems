import java.util.*;

public class BasketBallTogether {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read the number of players (n) and the power of the enemy team (d)
		long n = scanner.nextLong();
		long d = scanner.nextLong();

		// Create an array to store the power of each player		
		long[] a = new long[(int) n];
		// Read the power of each player
		for (int i = 0; i < n; i++) { // O(n)
			a[i] = scanner.nextLong();
		}

		// Sort the player powers in non-decreasing order
		Arrays.sort(a); // O(nlogn)

		// Initialize pointers and counters
		long left = -1; // Pointer to track the leftmost player in the current team
		long right = n - 1; // Pointer to track the rightmost player in the current team
		long teamSize = 1; // Current size of the team being formed
		long teams = 0; // Count of teams that can win

		// Iterate until all players are considered
		while (left < right) { // O(n)
			// Check if the current team can defeat the enemy team
			if ((a[(int) right] * teamSize) <= d && left < right) {
				// If not, increase the team size by including more players from the left
				left++;
				teamSize++;
			} else {
				// If the team can defeat the enemy, count this team as a win
				teams++;
				// Move the right pointer to form a new team
				right--;
				// Reset the team size for the new team
				teamSize = 1;
			}
		}

		// Output the maximum number of winning teams
		System.out.println(teams);
		scanner.close();
	}

	// Time Complexity (TC): O(nlogn) = O(10^5*log2(10^5)) = O(10^6)
	// Space Complexity (SC): O(n)
}
