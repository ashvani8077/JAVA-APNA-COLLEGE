import java.util.Scanner;

/* QUESTION: Use the following sorting Algorithms to sort an array in DESCENDING order.
    a. Bubble Sort.
    b. Selection Sort.
    c. Insertion Sort.
    d. Counting Sort.
 */
public class SortingQuestions {
    public static void bubbleSort(int arr[]){
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j< arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
            }
            }
        }
        for (int i:arr){
            System.out.print(" "+i+",");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of Array:");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Values:");
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }


        bubbleSort(arr);
    }
}
