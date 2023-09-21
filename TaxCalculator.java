//write a program to calculate tax based on salary.
import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int income;
        double tax;
        System.out.println("Enter Your Income:");
        income=sc.nextInt();
        if (income<500000){
            tax=0;
        } else if (income>500000 && income<1000000) {
            tax=income*0.2;
        }
        else{
            tax=income*0.3;
        }
        System.out.println("Your income is "+ income+" so tax is "+tax);
    }
}
