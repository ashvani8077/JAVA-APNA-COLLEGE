import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter radius=");
        float radius= sc.nextFloat();
        double area=3.141f*radius*radius;
        System.out.println(area);
    }
}
