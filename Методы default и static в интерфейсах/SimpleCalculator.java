/**
 * Программа для демонстрации интерфейса с default и static методами.
 * 
 * Начиная с Java 8, в интерфейсах можно объявлять:
 * - default методы (неабстрактные, могут быть переопределены)
 * - static методы (вызываются по имени интерфейса)
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */

/**
 * Интерфейс с default и static методами.
 */
interface Calculator {
    
    /**
     * Абстрактный метод сложения.
     * 
     * @param a первое число
     * @param b второе число
     * @return сумма
     */
    int add(int a, int b);
    
    /**
     * Default метод для вывода результата.
     * Может быть переопределён в классе-реализации.
     * 
     * @param result результат вычислений
     */
    default void showResult(int result) {
        System.out.println("Результат: " + result);
    }
    
    /**
     * Статический метод интерфейса.
     * Вызывается только через имя интерфейса.
     */
    static void info() {
        System.out.println("Это интерфейс Calculator");
    }
}

/**
 * Класс, реализующий интерфейс Calculator.
 */
public class SimpleCalculator implements Calculator {
    
    /**
     * Реализация абстрактного метода add.
     * 
     * @param a первое число
     * @param b второе число
     * @return сумма
     */
    @Override
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Переопределение default метода showResult.
     * 
     * @param result результат вычислений
     */
    @Override
    public void showResult(int result) {
        System.out.println("Ответ = " + result);
    }
}

/**
 * Демонстрационный класс.
 * Показывает все способы вызова методов интерфейса:
 * 1. Абстрактный метод через объект
 * 2. Default метод через объект класса
 * 3. Default метод через ссылку на интерфейс
 * 4. Статический метод через имя интерфейса
 */
class Main {
    
    /**
     * Главный метод программы.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        
        // Вызов абстрактного метода
        int sum = calc.add(5, 3);
        
        // Вызов default метода через объект класса
        calc.showResult(sum);
        
        // Вызов статического метода через имя интерфейса
        Calculator.info();
        
        // Вызов default метода через ссылку на интерфейс
        Calculator ref = calc;
        ref.showResult(15);
    }
}
