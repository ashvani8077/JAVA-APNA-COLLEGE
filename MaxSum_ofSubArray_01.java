//Print the sum of Maximum Sub Array.
public class MaxSum_ofSubArray_01 {
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        int current_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for (int i=1;i<num.length;i++){
            int start=i;
            for (int j=i;j< num.length;j++){
                int  end=j;
                for (int k=start;k<=end;k++){
                    current_sum=current_sum+num[k];

                }
                if (max_sum<current_sum){
                    max_sum=current_sum;
                }
                System.out.println("Max Sum for this: "+max_sum);
            }
        }
        System.out.println("Maximum Sum of Sub Array is: "+max_sum);
    }
}
