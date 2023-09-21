import java.util.Scanner;

//Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
//palindrome, 321 is not)
//A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
//palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
//palindrome because the reverse of 321 is 123, which is not equal to 321.
public class FunctionsQ3 {
    public static void palindrome(int n){
        int reverse=0;
        int temp=n;
        int remainder;
        while (n>0){
            remainder=n%10;
            reverse=(reverse*10)+remainder;
            n=n/10;
        }
        if(reverse==temp){
            System.out.print("Yes, It is palindrome.");
        }
        else {
            System.out.print("No, It is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num= sc.nextInt();
        palindrome(num);
    }
}
