import java.util.*;

public class Triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i=0; i<4; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int s1 = arr[0];
        int s2 = arr[1];
        int s3 = arr[2];
        int s4 = arr[3];
        if(s1+s2 > s3 || s2+s3 > s4){
            System.out.println("TRIANGLE");
            return;
        }

        if(s1+s2 == s3 || s2+s3 == s4){
            System.out.println("SEGMENT");
            return;
        }

        System.out.println("IMPOSSIBLE");
        
    }
}