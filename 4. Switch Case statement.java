import java.lang.Math;
public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        double num = 0.0;
        switch(ch){
            case 1:
                num = (Math.PI*a[0]*a[0]);
                break;
            case 2:
                num = a[0]*a[1];
                break;
        }
        return num;
    }
}