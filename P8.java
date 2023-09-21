import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Row:");
        int row= sc.nextInt();
        System.out.print("Column:");
        int column= sc.nextInt();
        //Hollow Pattern Using For Loop.
        System.out.println("Hollow Pattern Using For Loop.");
        for (int i=1;i<=row;i++){
            for (int j=1; j<=column;j++){
                if (i==1|| i==row|| j==1|| j==column){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       //Hollow Pattern Using While Loop.
        System.out.println("Hollow Pattern Using While Loop.");
        int i=1;
        int j=1;
        while (i<=row){
            while (j<=column){
                if (i==1 || i==row || j==1 || j==column){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
            j=1;
        }
    }
}
