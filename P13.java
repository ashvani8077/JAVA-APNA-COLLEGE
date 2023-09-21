import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num=sc.nextInt();
        //Solid Rhombus Pattern Using for loop.
        System.out.println("Solid Rhombus Pattern Using for loop.");
        for (int i=1;i<=num;i++){   //outer loop
            for (int j=1;j<=num-i;j++){     //Spaces
                System.out.print(" ");
            }
            for (int k=1;k<=num;k++){       //Star
                System.out.print("*");
            }
            System.out.println();
        }


        //Solid Rhombus Pattern Using while loop.
        System.out.println("Solid Rhombus Pattern Using While loop.");
        int i=1,j=1,k=1;
        while (i<=num){
            while (j<=num-i){
                System.out.print(" ");
                j++;
            }
            while (k<=num){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
            j=1;
            k=1;
        }
    }
}
