public class NarrowingCast {
    public static void main(String[] args) {
        double piNumber = 3.14159;
        int integerPart = (int) piNumber;
        System.out.println("double 3.14159 -> int: " + integerPart);
        
        int largeNumber = 200;
        byte smallByte = (byte) largeNumber;
        System.out.println("int 200 -> byte: " + smallByte);
        
        long longNumber = 70000L;
        short shortNumber = (short) longNumber;
        System.out.println("long 70000 -> short: " + shortNumber);
        
        int characterCode = 66;
        char symbol = (char) characterCode;
        System.out.println("int 66 -> char: " + symbol);
        
        double priceValue = 99.99;
        long longPrice = (long) priceValue;
        System.out.println("double 99.99 -> long: " + longPrice);
    }
}