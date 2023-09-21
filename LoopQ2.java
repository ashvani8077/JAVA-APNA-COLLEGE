import java.util.Scanner;

//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
public class LoopQ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,choice,evensum=0,oddsum=0;
        do{
            System.out.print("Enter the number:");
            num=sc.nextInt();
            if(num%2==0){
                evensum+=num;
            }
            else {
                oddsum+=num;
            }
            System.out.println("Do you want to continue? press 1 for yes, press 0 for no");
            choice=sc.nextInt();
        }while (choice==1);
        System.out.println("Sum of Even Number: "+evensum);
        System.out.println("Sum of Odd Number: "+oddsum);
    }
}
