import java.util.*;

public class InSearchOfConvenience{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            boolean flag = false;
            int x0 = sc.nextInt();
            int y0 = sc.nextInt();
            int r  = sc.nextInt();
            for(int x=x0-r; x<=x0+r; x++){
                for(int y=y0-r; y<=y0+r; y++){
                    int dx = x - x0;
                    int dy = y - y0;

                    if(dx * dx + dy * dy == r * r){
                        System.out.println(x + " " + y);
                        flag = true;
                        break;
                    }
                }
                if(flag) break;
            }
        }
        sc.close();
    }
}