interface Calculator {
    int add(int a, int b);
    
    default void showResult(int result) {
        System.out.println("Результат: " + result);
    }
    
    static void info() {
        System.out.println("Это интерфейс Calculator");
    }
}

public class SimpleCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
    
    @Override
    public void showResult(int result) {
        System.out.println("Ответ = " + result);
    }
}

class Main {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        int sum = calc.add(5, 3);
        calc.showResult(sum);
        Calculator.info();
        Calculator ref = calc;
        ref.showResult(15);
    }
}