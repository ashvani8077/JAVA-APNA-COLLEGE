public class SortingBubble {
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        for (int turn=0;turn< arr.length;turn++){
            for (int j=0;j< arr.length-1-turn;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i:arr){
            System.out.println(i);
        }
    }
}