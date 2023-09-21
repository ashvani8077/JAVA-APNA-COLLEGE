import java.util.Scanner;

//Write a program to take the price of pencil, pen and eraser and calculate gst.
public class VariableQ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Pencil=");
        int pencil= sc.nextInt();
        System.out.printf("Pen=");
        int pen=sc.nextInt();
        System.out.printf("Eraser=");
        int eraser= sc.nextInt();
        int net=pen+pencil+eraser;
        double gst=net*0.18f;
        System.out.println("Gst: "+gst);
        System.out.println("Net Price: "+net);
        System.out.println("Total Price: "+(net+gst));
    }
    }

