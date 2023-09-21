import java.util.Scanner;

//Write a program to convert Binary to Decimal using function.
public class BinaryToDecimal {
    public static void Binary(long binNum){
        long binNum2=binNum;
        int pow=0;
        int decNum=0;
        while (binNum>0){
            int lastDigit=(int)binNum%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("The binary number of "+binNum2+" is "+decNum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Binary Number:");
        long binNum= sc.nextLong();
        Binary(binNum);
    }
}
