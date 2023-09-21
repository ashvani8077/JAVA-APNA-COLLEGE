//Print Continuous Sub Array.
public class ArraySubArray {
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        int total_subArray=0;
        for (int i=0;i< a.length;i++){
            int start=i;
            for (int j=i;j<a.length;j++){
                int end=j;
                for (int k=start;k<=end;k++){
                    System.out.print(a[k]+" ");
                }
                total_subArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(total_subArray);
    }
}
