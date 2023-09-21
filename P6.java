//       *
//     * *
//   * * *
// * * * *
import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Number:");
        n= sc.nextInt();
        //Patttern using for loop.
        System.out.println("Pattern using for loop.");
        for (int i=1;i<=n;i++){
            for (int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Pattern using while loop.
        System.out.println("Pattern Using while loop.");
        int i=1;
        int j=1;
        int k=n-1;
        while (i<=n){
            while (k>=i){
                System.out.print(" ");
                k--;
            }
            while (j<=i){
                System.out.print("*");
                j++;
                }
            System.out.println();
            i++;
            k=n-1;
            j=1;
            }
        }
    }
