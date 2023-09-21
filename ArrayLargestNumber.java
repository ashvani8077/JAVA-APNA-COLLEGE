import java.util.*;
public class ArrayLargestNumber {
    public static void main(String[] args) {


        //Find Largest Number in an Array.
        int num[]={1,2,6,3,5};
        int largest=Integer.MIN_VALUE;
        for (int i=0;i< num.length;i++){
            if (num[i]>largest){
                largest=num[i];
            }
        }
        System.out.println("Largest Number: "+largest);
    }
}
