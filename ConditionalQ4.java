import java.util.Scanner;

//Write a program to take year as input from user and check if year is leap year or not.
public class ConditionalQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter Year:");
        year = sc.nextInt();
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }
}
