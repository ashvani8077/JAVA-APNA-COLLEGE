import java.util.Scanner;

public class StringShortestPath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("String: ");
        String str=sc.nextLine();
        int y=0;
        int x=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='N'){
                y++;
            }
            else if (ch=='S'){
                y--;
            }
            else if(ch=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        double result=Math.sqrt(x2+y2);
        System.out.println(result);
    }
}
