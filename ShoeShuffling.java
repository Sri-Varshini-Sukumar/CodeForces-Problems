import java.util.*;

public class ShoeShuffling{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long[] sizes = new long[(int)n];
            for(int i=0; i<n; i++){
                sizes[i] = sc.nextLong();
            }
            Map<Long,Long> hmp = new HashMap<>();
            for(int i=0; i<n; i++){
                hmp.put(sizes[i],hmp.getOrDefault(sizes[i],0L)+1L);
            }
            List<Long> students = new ArrayList<>();
            for(long i=1; i<=n; i++){   
                students.add(i);
            }
            boolean flag = false;
            for(long key : hmp.keySet()){
                if(hmp.get(key) == 1){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println(-1);
                continue;
            }
            int l = 0;
            int r = 0;
            while(r < n){
                if(sizes[l] == sizes[r]){
                    r++;
                }else{
                    Collections.rotate(students.subList(l,r),-1);
                    l=r;
                }
            }
            Collections.rotate(students.subList(l,r),-1);
            for(long it : students){
                System.out.print(it+" ");
            }
            System.out.println();
        }
    }
}