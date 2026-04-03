import java.util.ArrayList;

public class VarInferenceExample {
    public static void main(String[] args) {
        var byteValue = (byte) 100;
        var shortValue = (short) 30000;
        var intValue = 1_000_000;
        var longValue = 9_000_000_000L;
        var floatValue = 3.14f;
        var doubleValue = 2.718281828;
        var charValue = 'Z';
        var booleanValue = true;
        var stringValue = "Hello, Java!";
        var listValue = new ArrayList<String>();
        
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(booleanValue);
        System.out.println(stringValue);
        System.out.println(listValue);
    }
}