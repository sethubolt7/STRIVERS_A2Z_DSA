import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char s = sc.next().charAt(0);
       if(Character.isLetter(s)){
       if(Character.isUpperCase(s)){
           System.out.print(1);
       }
       else if(Character.isLowerCase(s)){
           System.out.print(0);
       }
       }
       else{
           System.out.print(-1);
       }

    }
}