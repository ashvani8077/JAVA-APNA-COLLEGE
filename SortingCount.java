public class SortingCount {
    public static void countSort(int arr[]){
        int large=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            large=Math.max(large, arr[i]);
        }
        int count[]=new int[large+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //SORTING
        int j=0;
        for (int i=0;i<count.length;i++){
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        for (int i:arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        countSort(arr);
    }
}
