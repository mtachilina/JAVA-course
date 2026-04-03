import java.util.ArrayList;
import java.util.List;

public class InstanceofGenericExample {
    public static void main(String[] args) {
        
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        
        // instanceof с сырым типом (raw type)
        System.out.println(stringList instanceof List); 
        
        // instanceof с параметризованным типом - ошибка компиляции
        // System.out.println(stringList instanceof List<String>); 
        
        // Обход: использовать wildcard
        System.out.println(stringList instanceof List<?>);  
        System.out.println(integerList instanceof List<?>); 
        
        // С пользовательским классом
        Wrapper<String> wrapperString = new Wrapper<>();
        Wrapper<Integer> wrapperInteger = new Wrapper<>();
        
        System.out.println(wrapperString instanceof Wrapper);  
        System.out.println(wrapperString instanceof Wrapper<?>); 
        
        // Ошибка: нельзя проверить конкретный тип параметра
        // System.out.println(wrapperString instanceof Wrapper<String>); 
    }
}

class Wrapper<T> {
    private T item;
    
    public void setItem(T item) {
        this.item = item;
    }
    
    public T getItem() {
        return item;
    }
}