//Display all numbers entered by the user except multiple of 10.
import java.util.Scanner;
public class ContinueQuestion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Start Entering Number:");
        do {
            int n= sc.nextInt();
            if (n%10==0){
                continue;
            }
            System.out.println("Your Number was "+n);
        }
        while (true);
    }
}
