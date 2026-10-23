import java.util.*;

public class EraseFirstOrSecondLetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt(); // Number of test cases

		while (t-- > 0) {
			int n = scanner.nextInt(); // Length of the string
			String s = scanner.next(); // Input string

			// Map to store frequency of each character in the string
			Map<Character, Integer> freq = new HashMap<>();
			int count = 0; // To count distinct characters

			// Array to store the number of distinct characters up to each index
			int[] distinct = new int[n];

			// Iterate over the string to calculate distinct characters
			for (int i = 0; i < n; i++) { // Complexity: O(n log n)
				char currentChar = s.charAt(i);
				freq.put(currentChar, freq.getOrDefault(currentChar, 0) + 1);
				if (freq.get(currentChar) == 1) {
					count++; // Increment count if character appears for the first time
				}
				distinct[i] = count; // Store the count of distinct characters up to index i
			}

			long ans = 0; // To store the final answer

			// Sum up the distinct counts for each position
			for (int i = 0; i < n; i++) { // Complexity: O(n)
				ans += distinct[i];
			}

			System.out.println(ans); // Output the result for the current test case
		}

		// Time Complexity (TC): O(n log n)
		// Space Complexity (SC): O(n)
	}
}
