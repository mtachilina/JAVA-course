public class MixedTypeArithmetic {
    public static void main(String[] args) {
        byte smallValue = 10;
        short mediumValue = 20;
        int standardValue = 30;
        long largeValue = 40L;
        float floatValue = 1.5f;
        double doubleValue = 2.5;
        
        int sumInt = smallValue + mediumValue;
        long sumLong = standardValue + largeValue;
        float sumFloat = largeValue + floatValue;
        double sumDouble1 = floatValue + doubleValue;
        double sumDouble2 = smallValue + doubleValue;
        
        System.out.println("byte+short = " + sumInt);
        System.out.println("int+long = " + sumLong);
        System.out.println("long+float = " + sumFloat);
        System.out.println("float+double = " + sumDouble1);
        System.out.println("byte+double = " + sumDouble2);
    }
}