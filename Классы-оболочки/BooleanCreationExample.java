/**
 * Программа для демонстрации всех способов создания объектов типа Boolean.
 * 
 * Класс Boolean является классом-оболочкой для примитивного типа boolean.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class BooleanCreationExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует пять способов создания Boolean объектов:
     * 
     * 1. Boolean.valueOf(boolean) - возвращает объект Boolean из примитива
     * 2. Boolean.valueOf(String) - преобразует строку в Boolean
     * 3. Boolean.parseBoolean(String) - возвращает примитив boolean
     * 4. Автоупаковка - автоматическое преобразование примитива в объект
     * 5. Конструктор new Boolean() (устаревший, не рекомендуется)
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Способ 1: valueOf(boolean)
        Boolean bool1 = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf(false);
        System.out.println("Boolean.valueOf(true): " + bool1);
        System.out.println("Boolean.valueOf(false): " + bool2);
        
        // Способ 2: valueOf(String)
        Boolean bool3 = Boolean.valueOf("true");
        Boolean bool4 = Boolean.valueOf("false");
        Boolean bool5 = Boolean.valueOf("TRUE");    
        Boolean bool6 = Boolean.valueOf("False");   
        Boolean bool7 = Boolean.valueOf("anything"); 
        System.out.println("\nBoolean.valueOf(\"true\"): " + bool3);
        System.out.println("Boolean.valueOf(\"false\"): " + bool4);
        System.out.println("Boolean.valueOf(\"TRUE\"): " + bool5);
        System.out.println("Boolean.valueOf(\"anything\"): " + bool7);
        
        // Способ 3: parseBoolean (возвращает примитив)
        boolean primitive1 = Boolean.parseBoolean("true");
        boolean primitive2 = Boolean.parseBoolean("false");
        System.out.println("\nBoolean.parseBoolean(\"true\"): " + primitive1);
        System.out.println("Boolean.parseBoolean(\"false\"): " + primitive2);
        
        // Способ 4: автоупаковка (boxing)
        Boolean bool8 = true;
        Boolean bool9 = false;
        System.out.println("\nАвтоупаковка: true -> " + bool8);
        
        // Способ 5: конструктор (устаревший, не рекомендуется к использованию)
        @SuppressWarnings("deprecation")
        Boolean bool10 = new Boolean(true);
        System.out.println("new Boolean(true): " + bool10);
    }
}
