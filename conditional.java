import java.util.*;
public class conditional {
    public static void main(String[] args) {
        int age = 16;
        if(age >= 18){
            System.out.println("Adult");
        }
        if(age > 13 && age < 18){
            System.out.println("Tennager");
        }
        else{
            System.out.println("Not Adult");
        }

        int a = 1 , b = 5;
        if(a >= b){
            System.out.println("A is largest of two");
        }
        else{
            System.out.println("B is largest of two");
        }

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
