import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num= sc.nextInt();
        //Inverted and Rotated Half Pyramid Pattern Using For Loop.
        System.out.println("Inverted and Rotated Half Pyramid Pattern Using For Loop.");
        for (int i=1;i<=num;i++){
            for (int k=1;k<=num-i;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Inverted and Rotated Half Pyramid Pattern Using While Loop.
        System.out.println("Inverted and Rotated Half Pyramid Pattern Using While Loop.");
        int i=1,j=1,k=1;
        while (i<=num){
            while (k<=num-i){
                System.out.print(" ");
                k++;
            }
            while (j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
            k=1;
            j=1;
        }
    }
}
