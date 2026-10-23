import java.util.Scanner;

public class PlayingWithDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values for player 1 (a) and player 2 (b)
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int p1Wins = 0;
        int draws = 0;
        int p2Wins = 0;
        
        // Check each of the 6 possible dice outcomes
        for (int x = 1; x <= 6; x++) {
            int distA = Math.abs(a - x);
            int distB = Math.abs(b - x);
            
            if (distA < distB) {
                p1Wins++;
            } else if (distA == distB) {
                draws++;
            } else {
                p2Wins++;
            }
        }
        
        // Output the results separated by spaces
        System.out.println(p1Wins + " " + draws + " " + p2Wins);
        
        scanner.close();
    }
}
