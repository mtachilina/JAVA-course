/**
 * Программа для демонстрации всех основных операторов в Java.
 * 
 * Включает следующие группы операторов:
 *   - Арифметические (плюс, минус, умножение, деление, остаток)
 *   - Сравнения (равно, не равно, больше, больше или равно, меньше, меньше или равно)
 *   - Логические (И, ИЛИ, НЕ)
 *   - Побитовые (И, ИЛИ, исключающее ИЛИ, НЕ)
 *   - Сдвига (вправо, влево, беззнаковый вправо)
 *   - Присваивания (простое и с операциями)
 *   - Инкремента и декремента (префиксные и постфиксные)
 *   - Строковой конкатенации
 *   - Тернарный
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class AllOperatorsExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует работу всех групп операторов с примерами.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Арифметические операторы
        System.out.println(" Арифметические операторы");
        
        int a = 10;
        int b = 3;
        
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        
        // Операторы сравнения
        System.out.println("\n Операторы сравнения");
        
        System.out.println("a = b: " + (a == b));
        System.out.println("a не равно b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        
        // Логические операторы
        System.out.println("\n Логические операторы");
        
        boolean x = true;
        boolean y = false;
        
        System.out.println("x И y: " + (x && y));
        System.out.println("x ИЛИ y: " + (x || y));
        System.out.println("НЕ x: " + (!x));
        
        // Побитовые операторы
        System.out.println("\n Побитовые операторы");
        
        int bitA = 5;
        int bitB = 3;
        
        System.out.println("bitA AND bitB: " + (bitA & bitB));
        System.out.println("bitA OR bitB: " + (bitA | bitB));
        System.out.println("bitA XOR bitB: " + (bitA ^ bitB));
        System.out.println("NOT bitA: " + (~bitA));
        
        // Операторы сдвига
        System.out.println("\n Операторы сдвига");
        
        int shiftValue = 16;
        System.out.println("shiftValue >> 2: " + (shiftValue >> 2));
        System.out.println("shiftValue << 2: " + (shiftValue << 2));
        System.out.println("shiftValue >>> 2: " + (shiftValue >>> 2));
        
        // Операторы присваивания
        System.out.println("\n Операторы присваивания");
        
        int value = 10;
        value += 5;
        System.out.println("value += 5: " + value);
        
        value -= 3;
        System.out.println("value -= 3: " + value);
        
        value *= 2;
        System.out.println("value *= 2: " + value);
        
        value /= 4;
        System.out.println("value /= 4: " + value);
        
        value %= 3;
        System.out.println("value %= 3: " + value);
        
        // Инкремент и декремент
        System.out.println("\n Инкремент и декремент");
        
        int counter = 5;
        
        System.out.println("counter++ (постфикс): " + (counter++));
        System.out.println("После counter++: " + counter);
        
        System.out.println("++counter (префикс): " + (++counter));
        
        System.out.println("counter-- (постфикс): " + (counter--));
        System.out.println("После counter--: " + counter);
        
        System.out.println("--counter (префикс): " + (--counter));
        
        // Операторы со строками
        System.out.println("\n Операторы со строками");
        
        String str1 = "Hello";
        String str2 = "World";
        
        System.out.println("str1 + str2: " + (str1 + str2));
        System.out.println("str1 + пробел + str2: " + (str1 + " " + str2));
        
        int number = 42;
        System.out.println("str1 + number: " + (str1 + number));
        
        String message = "Start";
        message += " End";
        System.out.println("message плюс равно End: " + message);
        
        // Тернарный оператор
        System.out.println("\n Тернарный оператор");
        
        int age = 18;
        String result = (age >= 18) ? "Взрослый" : "Ребенок";
        System.out.println("если age >= 18 то Взрослый иначе Ребенок: " + result);
    }
}
