import java.util.Scanner;

//write a program to convert decimal to binary using functions.
public class DecimalToBinary {
    public static void Decimal(int n){
        int decNum2=n;
        int rem;
        int pow=0;
        int binNum=0;
        while (n>0){
            rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary no. of "+decNum2+" is "+binNum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter decimal Num: ");
        int n= sc.nextInt();
        Decimal(n);
    }
}
