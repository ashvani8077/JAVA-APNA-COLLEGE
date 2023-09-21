import java.util.Scanner;

//Write a program to find the factorial of any number entered by the user.
public class LoopQ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number=");
        int fact=1;
        int num= sc.nextInt();
        while(num>0){
            fact=fact*num;
            num--;
        }
        System.out.println(fact);
    }
}
