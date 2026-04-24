/**
 * Программа для демонстрации множественного перехвата исключений.
 * 
 * 1. Multi-catch - перехват нескольких исключений в одном блоке catch.
 *    Важно: исключения не должны быть из одной иерархической цепочки.
 * 
 * 2. catch для иерархии исключений - блоки должны идти от потомка к предку.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class MultiCatchExample {
    
    // Иерархия собственных исключений
    static class Ex1 extends Exception { }   // базовое исключение
    static class Ex2 extends Ex1 { }         // подкласс Ex1
    static class Ex3 extends Ex2 { }         // подкласс Ex2
    
    /**
     * Главный метод программы.
     * Демонстрирует:
     * 1. Multi-catch - перехват разных исключений с одинаковой обработкой
     * 2. Перехват иерархии исключений от потомка к предку
     * 3. Ошибка при неправильном порядке catch-блоков
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Ситуация 1: несколько исключений обрабатываются идентично
        // Multi-catch с оператором |
        try {
            String str = null;
            int[] arr = {1, 2, 3};
            
            // Генерируем разные исключения в зависимости от условия
            if (args.length > 0) {
                System.out.println(arr[5]);        // ArrayIndexOutOfBoundsException
            } else {
                System.out.println(str.length());  // NullPointerException
            }
            
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            // Оба исключения обрабатываются одинаково
            System.out.println("Исключение перехвачено (идентичная обработка): " + e.getClass().getSimpleName());
        }
        
        // Ситуация 2: иерархия исключений Ex1 ← Ex2 ← Ex3
        // catch-блоки ДОЛЖНЫ идти от потомка к предку
        try {
            throw new Ex3();  // генерируем самый глубокий потомок
        } catch (Ex3 e) {
            System.out.println("Перехвачено Ex3 (самый конкретный)");
        } catch (Ex2 e) {
            System.out.println("Перехвачено Ex2");
        } catch (Ex1 e) {
            System.out.println("Перехвачено Ex1 (самый общий)");
        }
        
        // Неправильный порядок catch-блоков (закомментировано - ошибка)
        // Нельзя ставить предка перед потомком, так как потомок
        // уже будет перехвачен предком
        /*
        try {
            throw new Ex3();
        } catch (Ex1 e) {      // Предок - перехватит всё
            System.out.println("Ex1");
        } catch (Ex3 e) {      // Ошибка: недостижимый код
            System.out.println("Ex3");
        }
        */
    }
}
