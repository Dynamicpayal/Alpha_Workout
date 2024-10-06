import java.util.*;
public class typePromotion{
    public static void main(String[] args){
        // char a = 'a';
        // char b = 'b';
        // char c = a - b; Error
        // System.out.println((int)(a));
        // System.out.println((int)(b));
        // System.out.println(a);
        // System.out.println(b-a); 1

        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt =  a + b + c; //possible lossy conversion from int to byte.
        // byte bt = (byte)(a + b + c);
        // System.out.println(bt); //-127

        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;
        System.out.println(ans); // 85.25
    }
}