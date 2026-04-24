import java.util.StringJoiner;

/**
 * Программа для демонстрации работы класса StringJoiner.
 * 
 * StringJoiner используется для объединения строк с разделителем,
 * префиксом и суффиксом. Удобен для формирования строк из коллекций.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class StringJoinerExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует различные способы использования StringJoiner:
     * 
     * 1. Объединение строк с разделителем
     * 2. Добавление префикса и суффикса
     * 3. Слияние двух StringJoiner
     * 4. Обработка пустого значения
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Пример 1: объединение строк с разделителем (запятая и пробел)
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Яблоко");
        joiner1.add("Банан");
        joiner1.add("Апельсин");
        System.out.println(joiner1);  // Яблоко, Банан, Апельсин
        
        // Пример 2: с префиксом и суффиксом (квадратные скобки)
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("Красный");
        joiner2.add("Зелёный");
        joiner2.add("Синий");
        System.out.println(joiner2);  // [Красный, Зелёный, Синий]
        
        // Пример 3: слияние двух StringJoiner
        StringJoiner joiner3 = new StringJoiner(", ");
        joiner3.add("Понедельник");
        joiner3.add("Вторник");
        
        StringJoiner joiner4 = new StringJoiner(", ");
        joiner4.add("Среда");
        joiner4.add("Четверг");
        
        joiner3.merge(joiner4);  // объединяем joiner4 в joiner3
        System.out.println(joiner3);  // Понедельник, Вторник, Среда, Четверг
        
        // Пример 4: обработка пустого значения
        StringJoiner empty = new StringJoiner(", ");
        System.out.println("Пустой: " + empty);
        System.out.println("Пустой с дефолтом: " + empty.toString());
    }
}
