import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number:");
        int num = sc.nextInt();
        //0-1 Triangle Using For Loop.
        System.out.println("0-1 Triangle Using For Loop.");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
        //0-1 Triangle Using While Loop.
        System.out.println("0-1 Triangle Using While Loop.");
        int i=1;
        int j=1;
        while (i<=num){
            while (j<=i){
                if((i+j)%2==0){
                    System.out.print(" 1 ");
                }
                else {
                    System.out.print(" 0 ");
                }
                j++;
            }
            System.out.println();
            i++;
            j=1;
        }
    }
}
