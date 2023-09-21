import java.util.Scanner;

//Question 1 : Write a Java method to compute the average of three numbers
public class FunctionsQ1 {
    public static void Average(int n1, int n2, int n3){
        double average=(n1+n2+n3)/3;
        System.out.println("The Average of "+n1+", "+n2+" and "+n3+" is:"+average);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("No.1=");
        int n1= sc.nextInt();
        System.out.print("No.2=");
        int n2= sc.nextInt();
        System.out.print("No.3=");
        int n3= sc.nextInt();
        Average(n1,n2,n3);
    }
}
