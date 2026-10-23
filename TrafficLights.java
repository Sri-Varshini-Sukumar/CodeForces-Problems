import java.util.Scanner;

public class TrafficLight {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long t = scanner.nextLong(); // Read the number of test cases
		while (t-- > 0) {
			long n = scanner.nextLong(); // Read the length of the string
			char color = scanner.next().charAt(0); // Read the current color of the traffic light
			String s = scanner.next(); // Read the traffic light color sequence

			// Duplicate the string to simulate the cyclic nature of the traffic light
			s += s;

			// Update n to reflect the new length of the duplicated string
			n *= 2;

			// Initialize variables to track the last seen green light index and the maximum wait time
			long lastGreenIndex = -1;
			long maxSeconds = Integer.MIN_VALUE;

			// Traverse the string from the end to the beginning
			for (int i = (int) n - 1; i >= 0; i--) {
				// Update the last seen green light index
				if (s.charAt(i) == 'g') {
					lastGreenIndex = i;
				}

				// If the current color matches the given color, calculate the wait time
				if (s.charAt(i) == color) {
					long difference = lastGreenIndex - i;
					// Update the maximum wait time
					maxSeconds = Math.max(maxSeconds, difference);
				}
			}
			// Output the maximum wait time for the current test case
			System.out.println(maxSeconds);
		}
		scanner.close();
	}
}

// Time Complexity (TC): O(n) = O(2*10^5)
// Space Complexity (SC): O(n) = O(2*10^5)
