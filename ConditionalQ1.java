import java.util.Scanner;

//Question 1: Write a program to check given number is positive or negative using ternary operator.
public class ConditionalQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        String result;
        System.out.print("Enter a number:");
        num=sc.nextInt();
        result=(num<0)?"Negative":"Positive";
        System.out.println("Number is "+ result);
    }
}
