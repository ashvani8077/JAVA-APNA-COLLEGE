import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num=sc.nextInt();

        //DIAMOND Pattern Using for loop.
        System.out.println("Diamond Pattern Using for loop.");

        //UPSIDE
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //DOWNSIDE
        for (int i=num;i>=1;i--){
            for (int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }



        //DIAMOND Pattern Using While loop.
        System.out.println("Diamond Pattern Using While loop.");


        //UPSIDE
        int i=1;
        int j=1;
        int k=1;
        while (i<=num){
            while (j<=num-i){
                System.out.print(" ");
                j++;
            }
            while (k<=(2*i-1)){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
            j=1;
            k=1;
        }

        //DOWNSIDE
        i=num;
        while (i>=1){
            while (j<=num-i){
                System.out.print(" ");
                j++;
            }
            while (k<=(2*i-1)){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i--;
            j=1;
            k=1;
        }
    }
}
