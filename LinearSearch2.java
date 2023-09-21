public class LinearSearch2 {
    public static int search(String menu[],String find){
        for (int i=0;i< menu.length;i++){
            if (menu[i]==find){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[]={"Dosa","Petij","Samosa","Burger"};
        String find="Samosa";
        int index=search(menu,find);
        if (index==-1){
            System.out.println("Not Found");
        }
        else {
            System.out.println("It is on index no: "+index);
        }
    }
}
