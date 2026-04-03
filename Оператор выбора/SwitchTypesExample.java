public class SwitchTypesExample {
    public static void main(String[] args) {
        
        // 1. byte
        byte byteValue = 1;
        switch (byteValue) {
            case 1: System.out.println("byte: 1"); break;
            default: System.out.println("byte: default");
        }
        
        // 2. short
        short shortValue = 2;
        switch (shortValue) {
            case 2: System.out.println("short: 2"); break;
            default: System.out.println("short: default");
        }
        
        // 3. int
        int intValue = 3;
        switch (intValue) {
            case 3: System.out.println("int: 3"); break;
            default: System.out.println("int: default");
        }
        
        // 4. char
        char charValue = 'A';
        switch (charValue) {
            case 'A': System.out.println("char: A"); break;
            default: System.out.println("char: default");
        }
        
        // 5. String
        String stringValue = "hello";
        switch (stringValue) {
            case "hello": System.out.println("String: hello"); break;
            default: System.out.println("String: default");
        }
        
        // 6. enum
        Day enumValue = Day.MONDAY;
        switch (enumValue) {
            case MONDAY: System.out.println("enum: MONDAY"); break;
            default: System.out.println("enum: default");
        }
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}