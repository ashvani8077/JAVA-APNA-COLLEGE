import java.util.Scanner;

//Function Overloading using data type
public class Functions3 {
    //Function to calculate sum of two integer numbers.
    public static int sum(int a, int b){
        return a+b;
    }
    //Function to calculate sum of two float numbers.
    public static double sum(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("N0.1:");
        int n1= sc.nextInt();
        System.out.print("N0.2:");
        int n2=sc.nextInt();
        System.out.println("Float.1:");
        float n3= sc.nextFloat();
        System.out.println("Float.2:");
        float n4= sc.nextFloat();
        System.out.println("Sum of Integer:"+(sum(n1,n2)));
        System.out.println("Sum of Float:"+(sum(n3,n4)));
    }
}
