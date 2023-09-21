//Switch Case.
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String operator;
        int num1,num2;
        double result;
        System.out.print("Enter Num1:");
        num1=sc.nextInt();
        System.out.print("Enter Num2:");
        num2=sc.nextInt();
        System.out.print("Enter Operator:");
        operator=sc.next();
        switch (operator){
            case "+":
              result=num1+num2;
                System.out.println(result);
              break;
            case "-":
                result=num1-num2;
                System.out.println(result);
                break;
            case "*":
                result=num1*num2;
                System.out.println(result);
                break;
            case "/":
                result=num1/num2;
                System.out.println(result);
                break;
            case "%":
                result=num1%num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Please choose correct operation");
        }

    }
}
