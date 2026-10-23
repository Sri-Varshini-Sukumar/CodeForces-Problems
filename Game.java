import java.util.*;

public class Game{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n1 = Integer.parseInt(s[0]);
        int n2 = Integer.parseInt(s[1]);
        int k1 = Integer.parseInt(s[2]);
        int k2 = Integer.parseInt(s[3]);
        if(n1 > n2){
            System.out.println("First");
        }else{
            System.out.println("Second");
        }
    }
}