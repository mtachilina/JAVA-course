import java.util.ArrayList;
import java.util.List;

/**
 * Программа для демонстрации использования оператора instanceof
 * с параметризованными (generic) классами.
 * 
 * Из-за стирания типов (type erasure) в Java невозможно проверить
 * конкретный параметр типа. Можно использовать только сырые типы
 * или wildcard <?>.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class InstanceofGenericExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует возможность и ограничения instanceof с generic-типами.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        
        // instanceof с сырым типом (raw type) - работает
        System.out.println(stringList instanceof List); 
        
        // instanceof с конкретным параметризованным типом - ошибка компиляции
        // System.out.println(stringList instanceof List<String>); // ошибка
        
        // Решение: использовать wildcard <?>
        System.out.println(stringList instanceof List<?>);  
        System.out.println(integerList instanceof List<?>); 
        
        // С пользовательским generic-классом
        Wrapper<String> wrapperString = new Wrapper<>();
        Wrapper<Integer> wrapperInteger = new Wrapper<>();
        
        // Сырой тип - работает
        System.out.println(wrapperString instanceof Wrapper);  
        
        // Wildcard - работает
        System.out.println(wrapperString instanceof Wrapper<?>); 
        
        // Конкретный параметр типа - ошибка компиляции
        // System.out.println(wrapperString instanceof Wrapper<String>); // ошибка
    }
}

/**
 * Параметризованный класс-обёртка.
 * 
 * @param <T> тип хранимого значения
 */
class Wrapper<T> {
    private T item;
    
    public void setItem(T item) {
        this.item = item;
    }
    
    public T getItem() {
        return item;
    }
}
