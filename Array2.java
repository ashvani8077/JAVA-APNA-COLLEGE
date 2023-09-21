public class Array2 {
    public static void update(int marks[]){
        for (int i=0;i< marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {

        //PASSING Array as Arument.
        int marks[]={97,98,99};
        System.out.println("Before update:");
        for (int i:marks){
            System.out.println(i);
        }
        update(marks);
        System.out.println("After update:");
        for (int i:marks){
            System.out.println(i);
        }
    }
}
