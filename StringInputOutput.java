import java.util.Scanner;

public class StringInputOutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.next();
        System.out.println(name);
        sc.nextLine();
        String name2= sc.nextLine();
        System.out.println(name2);
    }
}
