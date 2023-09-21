//check student is pass or fail.
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.println("Enter marks:");
        marks=sc.nextInt();
        String result;
        result=(marks>=33)?"Pass":"Fail";
        System.out.println(result);
    }
}
