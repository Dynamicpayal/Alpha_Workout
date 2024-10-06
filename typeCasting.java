public class typeCasting {
    public static void main(String[] args){
        // float a = 25.0f;
        // int b = a;
        // System.out.println(b); //Error

        // float a = 25.9999f;
        // int b = (int)a;
        // System.out.println(b); //25

        char ch = 'a';
        char ch2 = 'A';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);//97
        System.out.println(number2);//65
    }
}

// Type Casting is also known as narrowing/explicit conversion.