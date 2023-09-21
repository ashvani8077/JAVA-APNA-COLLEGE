//Check Number is Prime or not.
import java.util.Scanner;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to check");
        int n= sc.nextInt();
        boolean isPrime=true;
        for (int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        if (isPrime==true){
            System.out.println(n+" is prime");
        }
        else {
            System.out.println(n+" is not a prime");
        }
    }
}
