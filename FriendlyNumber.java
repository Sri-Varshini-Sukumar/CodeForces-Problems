/*
A. Friendly Numbers
For an integer x
, we call another integer y friendly if the following condition holds:

y−d(y)=x
, where d(y)
 is the sum of the digits of y
.
For a given integer x
, determine how many friendly numbers it has.

Input
Each test contains multiple test cases. The first line contains the number of test cases t
 (1≤t≤500
). The description of the test cases follows.

Each test case consists of a single line containing one integer x
 (1≤x≤10^9
).

Output
For each test case, output one integer — the answer to the proble
*/

import java.util.*;

public class FriendlyNumber{
    public static int digitSum(int num){
        int res = 0;
        while(num > 0){
            int digit = num%10;
            res += digit;
            num /= 10;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int ans = 0;
            for(int dy=1; dy<=81; dy++){
                int y = x + dy;
                if(digitSum(y) == dy){
                    ans++;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}