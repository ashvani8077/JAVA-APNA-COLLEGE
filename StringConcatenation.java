import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("First Name: ");
        String fname=sc.next();
        sc.nextLine();
        System.out.print("Last Name: ");
        String lname= sc.next();
        String fullname=fname+" "+lname;
        System.out.println(fullname);
    }
}
