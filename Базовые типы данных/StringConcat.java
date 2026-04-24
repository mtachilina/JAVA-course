/**
 * Программа для демонстрации перегруженного оператора + с объектами String.
 * 
 * <p>В Java оператор + перегружен для типа String: он выполняет
 * конкатенацию (объединение) строк.</p>
 * 
 * <p>При конкатенации строки с другим типом, этот тип автоматически
 * преобразуется в строку через вызов String.valueOf().</p>
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class StringConcat {
    
    /**
     * Главный метод программы.
     * 
     * <p>Демонстрирует конкатенацию строки с различными типами данных:</p>
     * <ul>
     *   <li>String + int</li>
     *   <li>String + double</li>
     *   <li>String + boolean</li>
     *   <li>String + char</li>
     *   <li>String + long</li>
     *   <li>String + float</li>
     * </ul>
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Базовая строка
        String baseMessage = "Result: ";
        
        // Переменные разных типов для конкатенации
        int currentNumber = 100;
        double currentPrice = 49.99;
        boolean isValidStatus = true;
        char gradeSymbol = 'A';
        long totalCount = 5000L;
        float piValue = 3.14f;
        
        // Конкатенация строки с разными типами
        String finalResult = baseMessage + currentNumber + ", " + currentPrice + ", " + isValidStatus + ", " + gradeSymbol + ", " + totalCount + ", " + piValue;
        
        System.out.println(finalResult);
    }
}
