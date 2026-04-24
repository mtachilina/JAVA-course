/**
 * Программа для демонстрации доступа внутреннего класса к полям и методам внешнего класса.
 * 
 * Внутренний класс имеет доступ ко ВСЕМ (включая private) полям и методам внешнего класса.
 * Спецификаторы доступа внешнего класса не ограничивают внутренний класс.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class Outer {
    
    // Поля внешнего класса с разными спецификаторами доступа
    private int privateField = 1;      // только внутри Outer
    public int publicField = 2;        // доступен всем
    protected int protectedField = 3;  // доступен в пакете и подклассам
    int defaultField = 4;              // доступен в пакете (package-private)
    
    /**
     * Приватный метод внешнего класса.
     */
    private void privateMethod() {
        System.out.println("Private method");
    }
    
    /**
     * Внутренний класс Inner.
     * Имеет доступ ко всем членам внешнего класса.
     */
    public class Inner {
        
        /**
         * Метод внутреннего класса, демонстрирующий доступ
         * ко всем полям и методам внешнего класса.
         */
        public void accessOuterFields() {
            // Доступ к private полю внешнего класса
            System.out.println("privateField = " + privateField); 
            // Доступ к public полю
            System.out.println("publicField = " + publicField);  
            // Доступ к protected полю
            System.out.println("protectedField = " + protectedField); 
            // Доступ к default полю
            System.out.println("defaultField = " + defaultField);   
            
            // Доступ к private методу внешнего класса
            privateMethod();
        }
    }
    
    /**
     * Главный метод программы.
     * Демонстрирует создание внутреннего класса и вызов его метода.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();  // создание внутреннего класса
        inner.accessOuterFields();
    }
}
