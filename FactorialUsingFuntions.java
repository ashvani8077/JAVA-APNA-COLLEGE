import java.util.Scanner;

//write a program to find factorial of a number n using functions.
public class FactorialUsingFuntions {
    public static int factorial(int x){
        int fact=1;
        while(x>0){
            fact=fact*x;
            x--;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.print("Enter a number to find factorial:");
        num= sc.nextInt();
        int fact=factorial(num);
        System.out.println(fact);
    }
}
