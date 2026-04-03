import java.util.ArrayList;
import java.util.List;

public class WildcardExample {
    
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
        // list.add(10); // Ошибка. Нельзя добавлять (кроме null)
    }
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
        // Integer num = list.get(0); // Ошибка. Можно только Object
    }
    
    public static void main(String[] args) {
        
        System.out.println("<? extends T>");
        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.5, 2.5, 3.5);
        List<Number> numbers = List.of(1, 2.5, 3);
        
        printNumbers(integers);  
        printNumbers(doubles);   
        printNumbers(numbers);  
        
        System.out.println("\n<? super T>");
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
        
        addIntegers(numberList); 
        addIntegers(objectList);  
        addIntegers(new ArrayList<Integer>()); 
        
        System.out.println("numberList: " + numberList);
        System.out.println("objectList: " + objectList);
    }
}