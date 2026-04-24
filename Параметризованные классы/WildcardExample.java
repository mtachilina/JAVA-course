import java.util.ArrayList;
import java.util.List;

/**
 * Программа для демонстрации wildcard в параметризованных типах.
 * 
 * PECS (Producer Extends, Consumer Super):
 * - <? extends T> - для чтения (Producer)
 * - <? super T> - для записи (Consumer)
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class WildcardExample {
    
    /**
     * Метод с wildcard extends.
     * Принимает список любых типов, являющихся подтипом Number.
     * Можно читать элементы как Number, но нельзя добавлять.
     * 
     * @param list список чисел для вывода
     */
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
        // list.add(10); // Ошибка компиляции. Нельзя добавлять (кроме null)
    }
    
    /**
     * Метод с wildcard super.
     * Принимает список типов, являющихся супертипом Integer.
     * Можно добавлять элементы Integer, но читать как Object.
     * 
     * @param list список для добавления целых чисел
     */
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
        // Integer num = list.get(0); // Ошибка. Можно только Object
    }
    
    /**
     * Главный метод программы.
     * Демонстрирует работу wildcard extends и super.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Пример с extends (Producer - читаем данные)
        System.out.println("<? extends T>");
        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.5, 2.5, 3.5);
        List<Number> numbers = List.of(1, 2.5, 3);
        
        printNumbers(integers);   // Integer extends Number
        printNumbers(doubles);    // Double extends Number
        printNumbers(numbers);    // Number extends Number
        
        // Пример с super (Consumer - пишем данные)
        System.out.println("\n<? super T>");
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
        
        addIntegers(numberList);  // Number super Integer
        addIntegers(objectList);  // Object super Integer
        addIntegers(new ArrayList<Integer>()); // Integer super Integer
        
        System.out.println("numberList: " + numberList);
        System.out.println("objectList: " + objectList);
    }
}
