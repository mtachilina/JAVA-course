/**
 * Программа для демонстрации вложения класса в интерфейс.
 * 
 * В интерфейсе можно создавать вложенные классы.
 * Такие классы по умолчанию являются public static.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */

/**
 * Интерфейс MathUtils с вложенным классом Calculator.
 */
public interface MathUtils {
    
    /**
     * Абстрактный метод сложения.
     * 
     * @param a первое число
     * @param b второе число
     * @return сумма a и b
     */
    int add(int a, int b);
    
    /**
     * Вложенный класс Calculator внутри интерфейса.
     * По умолчанию является public static.
     */
    class Calculator {
        
        /**
         * Статический метод для вычисления квадрата числа.
         * 
         * @param x входное число
         * @return квадрат числа
         */
        public static double square(double x) {
            return x * x;
        }
        
        /**
         * Нестатический метод для вычисления куба числа.
         * 
         * @param x входное число
         * @return куб числа
         */
        public double cube(double x) {
            return x * x * x;
        }
    }
}

/**
 * Класс, реализующий интерфейс MathUtils.
 */
class SimpleMath implements MathUtils {
    
    /**
     * Реализация метода сложения.
     * 
     * @param a первое число
     * @param b второе число
     * @return сумма a и b
     */
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

/**
 * Демонстрационный класс.
 * Показывает способы вызова методов вложенного класса.
 */
class Main {
    
    /**
     * Главный метод программы.
     * Демонстрирует вызов статического и нестатического методов
     * вложенного класса Calculator.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Вызов статического метода через имя интерфейса и класса
        double result1 = MathUtils.Calculator.square(5);
        System.out.println("Квадрат: " + result1);
        
        // Создание экземпляра вложенного класса
        MathUtils.Calculator calc = new MathUtils.Calculator();
        
        // Вызов нестатического метода
        double result2 = calc.cube(3);
        System.out.println("Куб: " + result2);
    }
}
