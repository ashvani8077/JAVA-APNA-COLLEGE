//////Print the sum of Maximum Sub Array. (KADANE ALGORITHAM).
public class MaxSum_ofSubArray_03 {
    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        int current_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for (int i=0;i<num.length;i++){
            current_sum=current_sum+num[i];
            if (current_sum<0){
                current_sum=0;
            }
            max_sum=Math.max(current_sum,max_sum);
        }
        System.out.println(max_sum);
    }
}
