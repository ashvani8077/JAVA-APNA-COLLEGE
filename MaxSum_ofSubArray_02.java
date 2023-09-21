////Print the sum of Maximum Sub Array. (PREFIX METHOD).
public class MaxSum_ofSubArray_02 {
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        int current_sum=0;
        int max_sum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for (int i=1;i< prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }



        for (int i=0;i<num.length;i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                current_sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
            }
            if (max_sum<current_sum){
                max_sum=current_sum;
            }
        }
        System.out.println(max_sum);
    }
}
