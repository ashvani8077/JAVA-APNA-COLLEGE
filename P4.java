//A
//B C
//D E F
//G H I J
import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        char ch1='A';
        System.out.println("Number:");
        n= sc.nextInt();
        //Pattern using for loop.
        System.out.println("Patttern using for loop.");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" "+ch1+" ");
                ch1++;
            }
            System.out.println();
        }
        //Pattern using while loop.
        System.out.println("Pattern using while loop.");
        int i=1;
        int j=1;
        char ch2='A';
        while (i<=n){
            while (j<=i){
                System.out.print(" "+ch2+" ");
                ch2++;
                j++;
            }
            System.out.println();
            i++;
            j=1;
        }
    }
}
