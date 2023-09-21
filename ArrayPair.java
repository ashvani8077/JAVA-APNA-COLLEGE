import java.util.Scanner;

//Make pairs of array of java
public class ArrayPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size:");
        int size= sc.nextInt();
        int num[]=new int [size];
        System.out.println("Enter Value of Array:");
        for (int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        for (int i=0;i< num.length;i++){
            int curr=num[i];
            for (int j=i+1;j< num.length;j++){
                System.out.print("("+curr+","+num[j]+")");
            }
            System.out.println();
        }
    }
}
