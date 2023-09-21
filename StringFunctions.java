import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("String1: ");
        String str1=sc.nextLine();
        System.out.print("String2: ");
        String str2=sc.nextLine();
        if(str1.equals(str2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
