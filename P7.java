import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Number:");
        n= sc.nextInt();
        //Patttern using for loop.
        System.out.println("Pattern using for loop.");
        for (int i=1;i<=n;i++){
            for (int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for (int j=n-1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        //Pattern using while loop.
        System.out.println("Pattern using while loop");
        int i=1,j=n-1,k=1;
        while (i<=n){
            while (k<=i){
                System.out.print(" ");
                k++;
            }
            while (j>=i){
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
            k=1;
            j=n-1;
        }
    }
}
