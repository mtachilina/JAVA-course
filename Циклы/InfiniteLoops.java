/**
 * Программа для демонстрации бесконечных циклов в Java.
 * 
 * Бесконечный цикл while создаётся условием true.
 * Бесконечный цикл do-while создаётся условием true в блоке while.
 * 
 * Для предотвращения зависания программы в примерах используется break.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class InfiniteLoops {
    
    /**
     * Главный метод программы.
     * Демонстрирует два вида бесконечных циклов:
     * - while с условием true
     * - do-while с условием true
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {

        // Бесконечный цикл while
        while (true) {
            System.out.println("Бесконечный while");
            break; // break добавлен для выхода из цикла
        }
        
        // Бесконечный цикл do-while
        do {
            System.out.println("Бесконечный do-while");
            break; // break добавлен для выхода из цикла
        } while (true);
    }
}
