public class LinearSearch {
    public static int linearSearch(int arr[],int x) {
        for (int i : arr) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        //LINEAR SEARCH.

        int num[]={2,4,6,8,10,12,14,16,18};     //Array
        int find=10;            //Find 10 in Array.
        int index=linearSearch(num,find);
        if (index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Key Find that is on index no.: "+index);
        }
    }
}
