package primegenerator;

/**
 * Created by ArupPc on 13-05-2017.
 */
import java.util.*;

public class PrimeGenerator{
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        long start = System.currentTimeMillis();
        gen(n);
        long end = System.currentTimeMillis();
        System.out.println("\nTime taken: " + (double)(-start+end)/1000);
    }

    private static void gen(int n){
        boolean[] seive = new boolean[n+1];
        Arrays.fill(seive,true);
        seive[0]=seive[1] = false;
        for(int divisor = 2; divisor*divisor <= n; divisor++){
            if(seive[divisor]){
                for(int i = 2*divisor; i<=n; i+=divisor){
                    seive[i] = false;
                }
            }

            for(int i = 2; i < n+1; i++){
                if(seive[i])
                    System.out.print(i+" ");
            }
        }


    }
}