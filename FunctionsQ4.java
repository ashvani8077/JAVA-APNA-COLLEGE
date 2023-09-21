import java.util.Scanner;

//Question 4 : Write a Java method to compute the sum of the digits in an integer.
public class FunctionsQ4 {
    public static void sum(int num){
        int sum=0;
        while (num>0){
            int remainder=num%10;
            sum=sum+remainder;
            num=num/10;
        }
        System.out.println("The sum is:"+sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num= sc.nextInt();
        sum(num);
    }
}
