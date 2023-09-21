import java.util.Scanner;

//Question 2 : Write a method named isEven that accepts an int argument. The method
//should return true if the argument is even, or false otherwise. Also write a program to test your
//method.
public class FunctionsQ2 {
    public static String isEven(int n){
        String result;
        if(n%2==0){
            result="The Number is Even.";
        }
        else {
            result="The Number is Odd.";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num=sc.nextInt();
        String re=isEven(num);
        System.out.println(re);
    }
}
