/**
 * Программа для демонстрации перехваченного и неперехваченного исключения.
 * 
 * Перехваченное исключение - обработано в блоке try-catch,
 * программа продолжает работу.
 * 
 * Неперехваченное исключение - не обработано,
 * программа аварийно завершается.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class ExceptionHandlingExample {
    
    /**
     * Метод, который генерирует неперехваченное исключение.
     * ArrayIndexOutOfBoundsException не обрабатывается внутри метода.
     */
    public static void causeException() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);  // выход за границы массива
    }
    
    /**
     * Метод, который перехватывает исключение.
     * ArithmeticException обрабатывается в блоке try-catch.
     */
    public static void handleException() {
        try {
            int result = 10 / 0;  // деление на ноль
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }
        System.out.println("Код после try-catch продолжает работу");
    }
    
    /**
     * Главный метод программы.
     * Демонстрирует разницу между перехваченным и неперехваченным исключением.
     * 
     * Первое исключение перехватывается, программа продолжает работу.
     * Второе исключение не перехватывается, программа аварийно завершается.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        System.out.println("Перехваченное исключение");
        handleException();   // исключение перехвачено, программа продолжает работу
        System.out.println();
        
        System.out.println("Неперехваченное исключение");
        causeException();    // исключение НЕ перехвачено, аварийная остановка
        System.out.println("Этот код НЕ выполнится");
    }
}
