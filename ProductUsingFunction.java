import java.util.Scanner;

//write a program to find product of 2 numbers.
public class ProductUsingFunction {
    public static int product(int a, int b){
        int pro=a*b;
        return pro;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("No.1:");
        int n1=sc.nextInt();
        System.out.println("No.2:");
        int n2= sc.nextInt();
        int pro=product(n1,n2);
        System.out.println(pro);
    }
}
