import java.util.Scanner;

//write a program to find the area of square.
public class VariableQ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Side=");
        int side=sc.nextInt();
        int area=side*side;
        System.out.println(area);
    }
}
