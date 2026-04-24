/**
 * Программа для демонстрации метода decode() у классов-оболочек.
 * 
 * Метод decode() преобразует строковое представление числа в объект-оболочку.
 * Поддерживает десятичную, шестнадцатеричную (0x, 0X) и восьмеричную (0) системы.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class DecodeExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует работу decode() с различными системами счисления
     * и с разными типами чисел (Integer, Long, Byte, Short).
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Десятичная система счисления
        Integer dec1 = Integer.decode("100");
        System.out.println("decode(\"100\") = " + dec1);
        
        // Шестнадцатеричная система (префикс 0x или 0X)
        Integer hex1 = Integer.decode("0x64");
        Integer hex2 = Integer.decode("0X64");
        System.out.println("decode(\"0x64\") = " + hex1);
        
        // Восьмеричная система (префикс 0)
        Integer oct1 = Integer.decode("0144");
        System.out.println("decode(\"0144\") = " + oct1);
        
        // С отрицательным знаком
        Integer negative = Integer.decode("-100");
        System.out.println("decode(\"-100\") = " + negative);
        
        // С плюсом
        Integer positive = Integer.decode("+100");
        System.out.println("decode(\"+100\") = " + positive);
        
        // Для типа Long
        Long longVal = Long.decode("0xFF");
        System.out.println("Long.decode(\"0xFF\") = " + longVal);
        
        // Для типа Byte
        Byte byteVal = Byte.decode("0x7F");
        System.out.println("Byte.decode(\"0x7F\") = " + byteVal);
        
        // Для типа Short
        Short shortVal = Short.decode("010");
        System.out.println("Short.decode(\"010\") = " + shortVal);
    }
}
