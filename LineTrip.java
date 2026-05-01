import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            List<Integer> lst = new ArrayList<>();
            lst.add(0);
            for(int i=0; i<n; i++){
                lst.add(sc.nextInt());
            }
            lst.add(x);
            n = lst.size();
            int maxi = Integer.MIN_VALUE;
            for(int i=1; i<n; i++){
                if(i == n-1){
                    maxi = Math.max(maxi,2*(lst.get(i)-lst.get(i-1)));
                }else{
                    maxi = Math.max(maxi,lst.get(i)-lst.get(i-1));
                }
            }
            System.out.println(maxi);
        }
    }
}
