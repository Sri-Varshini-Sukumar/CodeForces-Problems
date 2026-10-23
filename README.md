
Codeforces Solutions

A curated collection of my accepted solutions to various competitive programming problems on Codeforces. This repository serves as a personal archive to track my problem-solving progress, algorithms mastery, and coding consistency.

🚀 Repository Highlights

• Language Used: Java (optimized for fast I/O performance).
• Structured Layout: Problems organized by difficulty or contest ID for easy navigation.
• Optimal Solutions: Code focused on efficient time and space complexities to pass strict time limits.

🛠️ Performance & Fast I/O Template

Codeforces time limits can be tight for Java. Most solutions in this repository utilize a custom FastScanner instead of java.util.Scanner to speed up input execution:
java
import java.io.*;
import java.util.*;

public class Template {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        // Solve the problem here
        
        out.close();
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
Use code with caution.

💻 How to Compile & Run Locally

To test a specific solution locally with your own sample inputs, open your terminal and run:
bash
# 1. Compile the file (ignoring generated .class files via .gitignore)
javac src/Division_2/CF_123_A.java -d bin

# 2. Run the compiled class file
java -cp bin Division_2.CF_123_A

My CodeForces Profile : https://codeforces.com/profile/Sri_Varshini_Sukumar
