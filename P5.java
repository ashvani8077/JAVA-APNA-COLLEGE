//*
//* *
//* * *
//* * * *
//* * *
//* *
//*
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Number:");
        n= sc.nextInt();
        //pattern using for loop.
        System.out.println("Pattern using for loop.");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i=n-1;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        //Pattern using while loop.
        System.out.println("Pattern using while loop.");
        int i=1;
        int j=1;
        while (i<=n){
            while (j<=i){
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i++;
            j=1;
        }
        i=n-1;
        while (i>1){
            while (j<=i){
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i--;
            j=1;
        }
    }
}
