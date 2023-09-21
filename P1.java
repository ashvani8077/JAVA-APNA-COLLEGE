//* * * *
//* * *
//* *
//*
import java.util.Scanner;
public class P1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Number:");
        n= sc.nextInt();
        //using for loop
        System.out.println("Using for loop.");
        for (int i=n;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        //using while loop.
        System.out.println("Using while loop.");
        int i=n,j=1;
        while(i>0){
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
