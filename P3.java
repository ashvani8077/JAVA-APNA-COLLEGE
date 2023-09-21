//1
//1 2
//1 2 3
//1 2 3 4
import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Number:");
        n= sc.nextInt();
        //Pattern using for loop.
        System.out.println("Pattern using for loop.");
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
        //Pattern using while loop.
        System.out.println("Pattern using while loop");
        int i=1;
        int j=1;
        while (i<=n){
            while(j<=i){
                System.out.print(" "+j+" ");
                j++;
            }
            System.out.println();
            i++;
            j=1;
        }
    }
}
