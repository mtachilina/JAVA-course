/**
 * Программа для демонстрации создания собственного класса исключения.
 * 
 * Собственное исключение должно:
 * 1. Наследоваться от Exception (checked) или RuntimeException (unchecked)
 * 2. По соглашению заканчиваться на "Exception"
 * 3. Определять минимум три конструктора:
 *    - без параметров
 *    - с сообщением
 *    - с сообщением и причиной
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */

/**
 * Собственный класс исключения.
 * Наследуется от Exception (checked exception).
 */
class MyFirstException extends Exception {
    
    /**
     * Конструктор без параметров.
     * Использует сообщение по умолчанию.
     */
    public MyFirstException() {
        super("Моё первое исключение");
    }
    
    /**
     * Конструктор с сообщением.
     * 
     * @param message детальное сообщение об ошибке
     */
    public MyFirstException(String message) {
        super(message);
    }
    
    /**
     * Конструктор с сообщением и причиной.
     * 
     * @param message детальное сообщение об ошибке
     * @param cause причина исключения (другое исключение-обёртка)
     */
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}

/**
 * Класс для демонстрации использования собственного исключения.
 */
public class CustomExceptionExample {
    
    /**
     * Метод, который выбрасывает собственное исключение.
     * 
     * @throws MyFirstException при вызове метода
     */
    public static void testMethod() throws MyFirstException {
        throw new MyFirstException("Что-то пошло не так");
    }
    
    /**
     * Главный метод программы.
     * Демонстрирует перехват собственного исключения.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Перехват исключения с сообщением
        try {
            testMethod();
        } catch (MyFirstException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }
        
        // Перехват исключения с сообщением по умолчанию
        try {
            throw new MyFirstException();
        } catch (MyFirstException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }
    }
}
