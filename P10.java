import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num= sc.nextInt();
        //FLOYD'S Triangle Pattern Using For Loop.
        System.out.println("FLOYD'S Triangle Pattern Using For Loop.");
        int counter1=1;
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" "+counter1);
                counter1++;
            }
            System.out.println();
        }
        //FLOYD'S Triangle Pattern Using While Loop.
        System.out.println("FLOYD'S Triangle Pattern Using While Loop.");
        int i=1;
        int j=1;
        int counter2=1;
        while (i<=num){
            while (j<=i){
                System.out.print(" "+counter2);
                counter2++;
                j++;
            }
            System.out.println();
            i++;
            j=1;
        }
    }
}
