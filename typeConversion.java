import java.util.*;
public class typeConversion {
    public static void main(String[] args){
    //    int a = 25;
    //    long b = a;
    //    System.out.println(b); // 25

    //     long a = 25;
    //     int b = a;
    //    System.out.println(b); // Error

    Scanner sc = new Scanner(System.in);
    float number = sc.nextInt();
    System.out.println(number); // If i/p is 15 then o/p is 15.0

    // Scanner sc = new Scanner(System.in);
    // int number = sc.nextFloat();
    // System.out.println(number); //Error
    }
}

//! byte->short->int->float->long->double

//* Conversion happens when: */
    //? a. type compatible
    //? b. destination type > source type 

// Lossy Conversion -> This occurs when data from a smaller data types is converted into a larger data types. 

//* Type conversion is also known as Widening/implicit conversion. */