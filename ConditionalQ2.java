import java.util.Scanner;

//Write s program to take temperature as input from user and check fever using ternary operator (temp>100 yes fever)
public class ConditionalQ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double temp;
        String result;
        System.out.println("What is your Temperature? ");
        temp= sc.nextDouble();
        result=(temp>100.00)?"Fever":"Dont Fever";
        System.out.println("Your Temperature is "+temp+ " so you have "+result);
    }
}
