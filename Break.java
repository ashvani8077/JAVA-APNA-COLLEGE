public class Break {
    public static void main(String[] args) {
        //use to break the loop.
        for (int i=1; i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out from the loop");
    }
}
