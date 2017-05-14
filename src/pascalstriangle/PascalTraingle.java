package pascalstriangle;

/**
 * Created by ArupPc on 13-05-2017.
 */
/*
row 1-		       1
row 2-	      	1     1
row 3-	     1    2    1
row 4-     1   3     3   1
row 5-  1   4    6    4   1
only 1 is at the borders..
a number in a pascal's triangle is sum of the 2 numbers(left  and right)
  above it.
 Application :
 	row i of pascal's triangle represents the coefficients of
 	a polynomial of ith degree
 	eg. coef of (x+1)*(x+1) = x2 + 2x + 1

*/

import java.util.Scanner;
public class PascalTraingle {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[][] ans = pt(n);

        print(ans);


    }
    public static void print(int[][] ans){

        for(int i = 0; i<ans.length; i++){
            for(int k = 1; k <= ans.length-i; k++)
                System.out.print(" ");
            for(int j = 0; j<ans[i].length; j++)
                System.out.print(ans[i][j] + " ");
            System.out.println();
        }
    }
    public static int[][] pt(int n){
        int[][] p = new int[n][];
        for(int i = 0; i<n; i++){
            p[i] = new int[i+1];
            p[i][0] = 1;
            for(int j = 1; j < i; j++){
                p[i][j] = p[i-1][j-1]+p[i-1][j];

            }
            p[i][i] = 1;
        }

        return p;
    }
}
