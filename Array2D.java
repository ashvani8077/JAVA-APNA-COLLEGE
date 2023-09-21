import java.util.Scanner;

public class Array2D {
    public static boolean search(int arr[][], int key){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (arr[i][j]==key){
                    System.out.println("Found at "+i+" "+j);
                    return true;
                }
            }
        }
        System.out.println("Key not found.");
        return false;
    }

    public static void main(String[] args) {
        int arr[][]=new int [3][3];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+ "   ");
            }
            System.out.println();
        }
        search(arr,5);
    }
}
