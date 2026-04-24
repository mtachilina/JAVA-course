import java.util.Formatter;

public class FormatterExample {
    public static void main(String[] args) {
        
        // %s - строковое представление
        System.out.printf("%s%n", "Привет, мир!");
        
        // %d - десятичное целое
        System.out.printf("Число: %d%n", 100);
        
        // %f - число с плавающей точкой
        System.out.printf("Число PI: %.2f%n", 3.14159);
        
        // %b - логическое значение
        System.out.printf("Результат: %b%n", true);
        
        // %% - вставка знака процента
        System.out.printf("Скидка 50%%%n");
        
        // %n - новая строка
        System.out.printf("Строка 1%nСтрока 2%n");
    }
}