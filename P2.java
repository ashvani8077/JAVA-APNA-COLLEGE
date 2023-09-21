//*
//* *
//* * *
//* * * *
import java.util.Scanner;
public class P2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Number:");
        n= sc.nextInt();
        //Pyramid pattern using for loop.
        System.out.println("Star Patter USing For Loop");
        for (int i=1;i<=n;i++){
            for (int j=1;j<+i+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        //Pyramid pattern using while loop.
        System.out.println("Star Patter USing While Loop");
        int i=1;
        int j=1;
        while(i<=n){
            while(j<=i){
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i++;
            j=1;
        }
    }
}
