import java.util.Scanner;

//Function Overloading
public class Functions2 {
    //Function to calculate sum of two numbers.
    public static int sum(int a, int b){
        return a+b;
    }
    //Function to calculate sum of three numbers.
    public static int sum(int a,int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("N0.1:");
        int n1= sc.nextInt();
        System.out.print("N0.2:");
        int n2=sc.nextInt();
        System.out.println("N0.3:");
        int n3= sc.nextInt();
        System.out.println("Sum of two:"+(sum(n1,n2)));
        System.out.println("Sum of three:"+(sum(n1,n2,n3)));
    }
}
