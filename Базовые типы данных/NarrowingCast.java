/**
 * Программа для демонстрации сужающих преобразований типов (явное приведение).
 * 
 * <p>Сужение (narrowing) — это преобразование от большего типа к меньшему.
 * Оно не выполняется автоматически, требует явного приведения (cast)
 * и может привести к потере данных.</p>
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class NarrowingCast {
    
    /**
     * Главный метод программы.
     * 
     * <p>Демонстрирует следующие сужающие преобразования:</p>
     * <ul>
     *   <li>double → int (потеря дробной части)</li>
     *   <li>int → byte (переполнение)</li>
     *   <li>long → short (переполнение)</li>
     *   <li>int → char (преобразование кода в символ)</li>
     *   <li>double → long (потеря дробной части)</li>
     * </ul>
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // double → int (теряется дробная часть)
        double piNumber = 3.14159;
        int integerPart = (int) piNumber;
        System.out.println("double 3.14159 -> int: " + integerPart);
        
        // int → byte (переполнение: 200 - 256 = -56)
        int largeNumber = 200;
        byte smallByte = (byte) largeNumber;
        System.out.println("int 200 -> byte: " + smallByte);
        
        // long → short (переполнение)
        long longNumber = 70000L;
        short shortNumber = (short) longNumber;
        System.out.println("long 70000 -> short: " + shortNumber);
        
        // int → char (код 66 соответствует символу 'B')
        int characterCode = 66;
        char symbol = (char) characterCode;
        System.out.println("int 66 -> char: " + symbol);
        
        // double → long (теряется дробная часть)
        double priceValue = 99.99;
        long longPrice = (long) priceValue;
        System.out.println("double 99.99 -> long: " + longPrice);
    }
}
