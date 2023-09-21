public class Continue {
    public static void main(String[] args) {
        //To skip iteration.
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Skip 3");
    }
}
