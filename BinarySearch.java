public class BinarySearch {
    public static int binarySearch(int num[],int key){
        int start=0;
        int end=num.length-1;
        while (start<=end){
            int mid=(start+end)/2;

            //Comparision
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){           //Right Condition
                start=mid+1;
            }
            else {                      //Left Condition
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14};
        int find=10;
        System.out.println("Index for key is: "+binarySearch(num,find));
    }
}
