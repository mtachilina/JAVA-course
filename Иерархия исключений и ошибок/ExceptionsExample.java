/**
 * Программа для демонстрации генерации и обработки различных исключений.
 * 
 * В примере рассматриваются пять типов исключений:
 * 1. ArithmeticException - арифметическая ошибка (деление на ноль)
 * 2. ArrayIndexOutOfBoundsException - выход за границы массива
 * 3. IllegalArgumentException - неверный аргумент метода
 * 4. ClassCastException - неверное приведение типов
 * 5. NullPointerException - обращение к null объекту
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class ExceptionsExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует перехват и обработку пяти различных исключений.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // 1. ArithmeticException возникает при делении на ноль
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        
        // 2. ArrayIndexOutOfBoundsException возникает при выходе за границы массива
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // индекс 5, а максимальный 2
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        
        // 3. IllegalArgumentException возникает при передаче неверного аргумента
        try {
            setAge(-5);  // возраст не может быть отрицательным
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
        
        // 4. ClassCastException возникает при неверном приведении типов
        try {
            Object obj = "Hello";      // String
            Integer num = (Integer) obj;  // нельзя привести String к Integer
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }
        
        // 5. NullPointerException возникает при обращении к null объекту
        try {
            String str = null;
            System.out.println(str.length());  // str = null, метод вызвать нельзя
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
    
    /**
     * Метод, который выбрасывает IllegalArgumentException при отрицательном возрасте.
     * 
     * @param age возраст для проверки
     * @throws IllegalArgumentException если возраст отрицательный
     */
    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным: " + age);
        }
        System.out.println("Возраст: " + age);
    }
}
