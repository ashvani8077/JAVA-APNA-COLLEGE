import java.util.Scanner;

//Write a program to print the multiplication table of a number N, entered by the user.
public class LoopQ4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number=");
        int num=sc.nextInt();
        for (int i=1;i<11;i++){
            int table=num*i;
            System.out.println(num+"X"+i+"="+table);
        }
    }
}
