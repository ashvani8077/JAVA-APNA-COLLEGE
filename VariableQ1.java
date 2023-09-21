import java.util.Scanner;

//Write a program to find the average of three numbers.
public class VariableQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Number1=");
        int n1=sc.nextInt();
        System.out.printf("Number2=");
        int n2=sc.nextInt();
        System.out.printf("Number3=");
        int n3=sc.nextInt();
        double avg=(n1+n2+n3)/3;
        System.out.println(avg);
    }
}
