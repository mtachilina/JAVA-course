import java.util.ArrayList;

/**
 * Программа для демонстрации вывода типов (type inference) с использованием var.
 * 
 * <p>Начиная с Java 10, компилятор может сам определять тип переменной
 * по правой части выражения. Для этого используется ключевое слово var
 * вместо явного указания типа.</p>
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class VarInferenceExample {
    
    /**
     * Главный метод программы.
     * 
     * <p>Демонстрирует использование var для переменных различных типов:</p>
     * <ul>
     *   <li>byte</li>
     *   <li>short</li>
     *   <li>int</li>
     *   <li>long</li>
     *   <li>float</li>
     *   <li>double</li>
     *   <li>char</li>
     *   <li>boolean</li>
     *   <li>String</li>
     *   <li>ArrayList</li>
     * </ul>
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Компилятор сам определяет тип каждой переменной
        var byteValue = (byte) 100;           // byte
        var shortValue = (short) 30000;       // short
        var intValue = 1_000_000;             // int
        var longValue = 9_000_000_000L;       // long
        var floatValue = 3.14f;               // float
        var doubleValue = 2.718281828;        // double
        var charValue = 'Z';                  // char
        var booleanValue = true;              // boolean
        var stringValue = "Hello, Java!";     // String
        var listValue = new ArrayList<String>(); // ArrayList<String>
        
        // Вывод значений
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
