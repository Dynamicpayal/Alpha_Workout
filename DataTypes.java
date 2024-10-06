public class DataTypes {
    public static void main(String[] args){
        byte b = 8; //We can store value Upto 256(-128 to 127) -> 1 byte
        System.out.println(b);
        char ch = 'A';// -> 2 bytes
        System.err.println(ch);
        boolean var = false;// -> 1 byte
        float price = 0.5f;//To store big decimal value we use double(8 bytes). -> 4 bytes
        int num = 25; //(-2B to 2B)To store big int we use long(8 bytes). -> 4 bytes
        short n = 240;// -> 2 bytes
        System.out.println(price);
    }
}

//Java is a typed language.That means we have to declare the type of the variable in java programming language.