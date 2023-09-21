import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num= sc.nextInt();
        //Butterfly Pattern Using For Loop.
        System.out.println("Butterfly Pattern Using For Loop.");

        //UpSide
        for (int i=1;i<=num;i++){
            //Star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces
            for (int k=1;k<=2*(num-i);k++){
                System.out.print(" ");
            }
            //Star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

            //DownSide
        for (int i=num;i>=1;i--){
            //Star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces
            for (int k=1;k<=2*(num-i);k++){
                System.out.print(" ");
            }
            //Star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        //Butterfly Pattern Using While Loop.
        System.out.println("Butterfly Pattern Using While Loop.");
        int i=1,j=1,k=1,l=1;


        //UpSide
        while (i<=num){
            while (j<=i){
                System.out.print("*");
                j++;
            }
            while (k<=2*(num-i)){
                System.out.print(" ");
                k++;
            }
            while (l<=i){
                System.out.print("*");
                l++;
            }
            System.out.println();
            i++;
            j=1;
            k=1;
            l=1;
        }


        //DownSide
        i=num;
        while (i>=1){
            while (j<=i){
                System.out.print("*");
                j++;
            }
            while (k<=2*(num-i)){
                System.out.print(" ");
                k++;
            }
            while (l<=i){
                System.out.print("*");
                l++;
            }
            System.out.println();
            i--;
            j=1;
            k=1;
            l=1;
        }
    }
}
