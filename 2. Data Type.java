import java.util.Scanner;
public class Solution {
    public static int dataTypes(String type) {
        int num =0;
        String s = type;
        if(s.equals("Long")){
            num = 8;
        }
        else if(s.equals("Float")){
            num = 4;
        }
        else if(s.equals("Double")){
            num = 8;
        }
        else if(s.equals("Character")){
            num = 1;
        }
        else if(s.equals("Integer")){
            num = 4;
        }
        return num;
    }
}