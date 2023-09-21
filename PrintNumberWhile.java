//write a program to print 1 to n using while loop.
import java.util.Scanner;
public class PrintNumberWhile {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.print("Enter Last number:");
        int num= sc.nextInt();
        int counter=1;
        while(counter<num+1){
            System.out.println(counter);
            counter++;
        }
    }
}
