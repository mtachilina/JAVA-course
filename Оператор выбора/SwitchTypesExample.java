/**
 * Программа для демонстрации всех типов данных,
 * которые можно использовать в конструкции switch.
 * 
 * В Java в switch можно использовать следующие типы:
 * - byte, short, int, char
 * - String (начиная с Java 7)
 * - enum
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class SwitchTypesExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует использование switch с разными типами данных.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Тип byte
        byte byteValue = 1;
        switch (byteValue) {
            case 1: System.out.println("byte: 1"); break;
            default: System.out.println("byte: default");
        }
        
        // Тип short
        short shortValue = 2;
        switch (shortValue) {
            case 2: System.out.println("short: 2"); break;
            default: System.out.println("short: default");
        }
        
        // Тип int
        int intValue = 3;
        switch (intValue) {
            case 3: System.out.println("int: 3"); break;
            default: System.out.println("int: default");
        }
        
        // Тип char
        char charValue = 'A';
        switch (charValue) {
            case 'A': System.out.println("char: A"); break;
            default: System.out.println("char: default");
        }
        
        // Тип String
        String stringValue = "hello";
        switch (stringValue) {
            case "hello": System.out.println("String: hello"); break;
            default: System.out.println("String: default");
        }
        
        // Тип enum
        Day enumValue = Day.MONDAY;
        switch (enumValue) {
            case MONDAY: System.out.println("enum: MONDAY"); break;
            default: System.out.println("enum: default");
        }
    }
}

/**
 * Перечисление дней недели для демонстрации switch с enum.
 */
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}
