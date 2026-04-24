/**
 * Программа для демонстрации возникновения NullPointerException
 * при автоупаковке и автораспаковке.
 * 
 * NullPointerException возникает, когда происходит попытка распаковать
 * (unboxing) объект-оболочку, который равен null.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class NullPointerExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует три случая возникновения NullPointerException:
     * 
     * 1. Прямая распаковка null-объекта
     * 2. Арифметическая операция с null-объектом
     * 3. Сравнение null-объекта с примитивом
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Случай 1: прямая распаковка null
        Integer nullInteger = null;

        try {
            int value = nullInteger;  // распаковка null -> NPE
            System.out.println(value);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: nullInteger не может быть распакован");
        }
        
        // Случай 2: арифметическая операция с null
        Integer a = null;
        Integer b = 10;
        
        try {
            int result = a + b;  // распаковка a(null) -> NPE
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: при сложении a (null) + b");
        }
        
        // Случай 3: сравнение null с примитивом
        Integer x = null;
        // В следующей строке происходит распаковка x(null) -> NPE
        if (x == 5) {
            System.out.println("равно");
        } else {
            System.out.println("не равно");
        }
    }
}
