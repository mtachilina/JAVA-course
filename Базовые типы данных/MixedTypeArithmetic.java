/**
 * Программа для демонстрации расширяющих преобразований типов в арифметических операциях.
 * 
 * <p>В Java при выполнении арифметических операций с разными типами данных
 * меньший тип автоматически расширяется до большего. Результат операции
 * всегда имеет тип наибольшего из операндов.</p>
 * 
 * <p>Цепочка расширения: byte → short → int → long → float → double</p>
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class MixedTypeArithmetic {
    
    /**
     * Главный метод программы.
     * 
     * <p>Демонстрирует арифметические операции с различными типами данных:</p>
     * <ul>
     *   <li>byte + short → int</li>
     *   <li>int + long → long</li>
     *   <li>long + float → float</li>
     *   <li>float + double → double</li>
     *   <li>byte + double → double</li>
     * </ul>
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Инициализация переменных разных типов
        byte smallValue = 10;     // 8 бит
        short mediumValue = 20;   // 16 бит
        int standardValue = 30;   // 32 бита
        long largeValue = 40L;    // 64 бита
        float floatValue = 1.5f;  // 32 бита (числа с плавающей точкой)
        double doubleValue = 2.5; // 64 бита (удвоенная точность)
        
        // byte + short → int (оба расширяются до int)
        int sumInt = smallValue + mediumValue;
        
        // int + long → long (int расширяется до long)
        long sumLong = standardValue + largeValue;
        
        // long + float → float (long расширяется до float)
        float sumFloat = largeValue + floatValue;
        
        // float + double → double (float расширяется до double)
        double sumDouble1 = floatValue + doubleValue;
        
        // byte + double → double (byte расширяется до double)
        double sumDouble2 = smallValue + doubleValue;
        
        // Вывод результатов
        System.out.println("byte+short = " + sumInt);
        System.out.println("int+long = " + sumLong);
        System.out.println("long+float = " + sumFloat);
        System.out.println("float+double = " + sumDouble1);
        System.out.println("byte+double = " + sumDouble2);
    }
}
