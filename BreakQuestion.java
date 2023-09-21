//write a program using break when user enter 10 or 10 multiple break the iteration.
import java.util.Scanner;
public class BreakQuestion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        do{
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
        System.out.println("Loop Ended Because You Enter 10 multiple");
    }
}
