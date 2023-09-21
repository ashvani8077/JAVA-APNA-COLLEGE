import java.util.Scanner;

//Write a program to take input from user (1-7) and print day name using switch statement.
public class ConditionalQ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day;
        System.out.println("Enter Day Number:");
        day= sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Choose only between 1-7");
        }
    }
}
