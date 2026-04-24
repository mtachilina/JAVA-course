/**
 * Программа для демонстрации всех спецификаторов доступа в Java.
 * 
 * В Java существует четыре уровня доступа:
 * - private: доступен только внутри данного класса
 * - default (package-private): доступен внутри пакета
 * - protected: доступен внутри пакета и в подклассах
 * - public: доступен всем классам везде
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class AccessModifiersExample {
    
    // Поля с разными спецификаторами доступа
    private int privateVar = 1;      // только внутри класса
    int defaultVar = 2;              // внутри пакета (без спецификатора)
    protected int protectedVar = 3;  // внутри пакета + подклассы
    public int publicVar = 4;        // доступен всем
    
    /**
     * Приватный метод. Доступен только внутри данного класса.
     */
    private void privateMethod() {
        System.out.println("private: только внутри класса");
    }
    
    /**
     * Метод с доступом по умолчанию (package-private).
     * Доступен внутри того же пакета.
     */
    void defaultMethod() {
        System.out.println("default: внутри пакета");
    }
    
    /**
     * Защищённый метод. Доступен внутри пакета и в подклассах.
     */
    protected void protectedMethod() {
        System.out.println("protected: пакет + подклассы");
    }
    
    /**
     * Публичный метод. Доступен всем классам в любом пакете.
     */
    public void publicMethod() {
        System.out.println("public: всем");
    }
    
    /**
     * Главный метод программы.
     * Демонстрирует, что внутри класса доступны все члены,
     * независимо от их спецификатора доступа.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        AccessModifiersExample obj = new AccessModifiersExample();
        
        System.out.println("=== Доступ внутри класса ===");
        System.out.println("privateVar = " + obj.privateVar);
        System.out.println("defaultVar = " + obj.defaultVar);
        System.out.println("protectedVar = " + obj.protectedVar);
        System.out.println("publicVar = " + obj.publicVar);
        
        obj.privateMethod();
        obj.defaultMethod();
        obj.protectedMethod();
        obj.publicMethod();
    }
}
