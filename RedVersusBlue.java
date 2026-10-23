import java.util.*;

public class RedVersusBlue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();
            int length_of_red = r/(b+1);
            int extra_red = r%(b+1);
            StringBuilder sb = new StringBuilder();
            for(int times=1; times<=b+1; times++){
                for(int i=0; i<length_of_red; i++){
                    sb.append("R");
                }

                if(extra_red > 0){
                    sb.append("R");
                     extra_red--;
                }

                if(times != b+1){
                    sb.append("B");
                }
            }
            System.out.println(sb.toString());
        }
    }
}