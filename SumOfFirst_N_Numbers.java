//write a program to print sum of n using while loop.
import java.util.Scanner;
public class SumOfFirst_N_Numbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Last number:");
        int num= sc.nextInt();
        int sum=0;
        int counter=1;
        while(counter<num+1){
            sum+=counter;
            counter++;
        }
        System.out.println(sum);
    }
}
