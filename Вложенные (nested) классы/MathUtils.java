// Интерфейс с вложенным классом
public interface MathUtils {
    
    int add(int a, int b);
    
    // Вложенный класс
    class Calculator {
        public static double square(double x) {
            return x * x;
        }
        
        public double cube(double x) {
            return x * x * x;
        }
    }
}

// Реализация интерфейса
class SimpleMath implements MathUtils {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

class Main {
    public static void main(String[] args) {
        // Вызов статического метода вложенного класса
        double result1 = MathUtils.Calculator.square(5);
        System.out.println("Квадрат: " + result1);
        
        // Создание экземпляра и вызов нестатического метода
        MathUtils.Calculator calc = new MathUtils.Calculator();
        double result2 = calc.cube(3);
        System.out.println("Куб: " + result2);
    }
}