import java.util.*;

public class Sleuth{
    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch == ' ' || ch == '?') continue;
            else if(isVowel(ch)){
                System.out.println("YES");
                break;
            }
            else{
                System.out.println("NO");
                break;
            }
        }
    }
}