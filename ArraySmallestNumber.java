import java.util.*;
public class ArraySmallestNumber {
    public static void main(String[] args) {


        //Find Largest Number in an Array.
        int num[]={10,2,6,3,5};
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i< num.length;i++){
            if (num[i]<smallest){
                smallest=num[i];
            }
        }
        System.out.println("Smallest Number: "+smallest);
    }
}
