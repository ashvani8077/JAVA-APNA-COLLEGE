import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("String: ");
        String str=sc.nextLine();
        for (int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.println("Not a Palindrome.");
            }
            else{
                System.out.println("Palindrome.");
            }
        }
    }
}
