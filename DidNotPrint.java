import java.util.*;
import java.io.*;

public class DidNotPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        
        int t = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();

            boolean[] printed = new boolean[n + 1];
            Deque<Integer> stk = new ArrayDeque<>();

            // Fix 1: Changed loop condition to i <= n
            for (int i = 1; i <= n; i++) {
                char ch = s.charAt(i - 1);
                if (ch == '1') {
                    stk.push(i);
                } else if (ch == '2') {
                    if (!stk.isEmpty()) {
                        printed[stk.pop()] = true; // Fixed: stk.pop() directly marks and removes
                    } else {
                        printed[i] = true;
                    }
                } else if (ch == '3') {
                    printed[i] = true;
                }
            }

            List<Integer> lst = new ArrayList<>();
            // Fix 1: Changed loop condition to i <= n
            for (int i = 1; i <= n; i++) {
                if (!printed[i]) {
                    lst.add(i);
                }
            }

            // Fix 2: First print the count k
            sb.append(lst.size()).append("\n");

            // Then print the space-separated list
            for (int i = 0; i < lst.size(); i++) {
                sb.append(lst.get(i));
                if (i < lst.size() - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        // Print everything at once for speed
        System.out.print(sb);
    }
}