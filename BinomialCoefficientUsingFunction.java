import java.util.Scanner;

//write a program to find coefficient binomial of a number using functions.
public class BinomialCoefficientUsingFunction {
    public static int factorial(int x){
        int fact=1;
        while(x>0){
            fact=fact*x;
            x--;
        }
        System.out.println("Fact is: "+fact);
        return fact;
    }
    public static int Binomial(int n, int r){
        int nfact=factorial(n);
        int rfact=factorial(r);
        int nrfact=factorial(n-r);
        int nr=rfact*nrfact;
        int result=nfact/nr;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Value of n:");
        int a= sc.nextInt();
        System.out.print("Value of n:");
        int b= sc.nextInt();
        int result=Binomial(a,b);
        System.out.println("Result:"+result);
    }
}
