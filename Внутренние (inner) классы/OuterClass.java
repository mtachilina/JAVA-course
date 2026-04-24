/**
 * Программа для демонстрации спецификаторов доступа для внутренних классов.
 * 
 * Внутренние классы могут иметь следующие спецификаторы:
 * - public: доступен везде
 * - protected: доступен в пакете и подклассам
 * - default (без спецификатора): доступен только в пакете
 * - private: доступен только внутри внешнего класса
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class OuterClass {
    
    /**
     * Публичный внутренний класс.
     * Доступен всем классам везде.
     */
    public class PublicInner {
        public void show() {
            System.out.println("Public inner class");
        }
    }
    
    /**
     * Защищённый внутренний класс.
     * Доступен в том же пакете и в подклассах (даже в других пакетах).
     */
    protected class ProtectedInner {
        public void show() {
            System.out.println("Protected inner class");
        }
    }
    
    /**
     * Внутренний класс с доступом по умолчанию (package-private).
     * Доступен только в пределах того же пакета.
     */
    class DefaultInner {
        public void show() {
            System.out.println("Default inner class");
        }
    }
    
    /**
     * Приватный внутренний класс.
     * Доступен только внутри внешнего класса.
     */
    private class PrivateInner {
        public void show() {
            System.out.println("Private inner class");
        }
    }
    
    /**
     * Демонстрация доступа внутри внешнего класса.
     * Внешний класс имеет доступ ко всем внутренним классам,
     * включая private.
     */
    public void testInner() {
        PublicInner pi = new PublicInner();
        ProtectedInner prot = new ProtectedInner();
        DefaultInner di = new DefaultInner();
        PrivateInner priv = new PrivateInner();
        
        pi.show();
        prot.show();
        di.show();
        priv.show();
    }
}

/**
 * Класс в том же пакете для демонстрации доступности.
 */
class SamePackageTest {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        
        // public - доступен
        OuterClass.PublicInner pi = outer.new PublicInner();
        pi.show();
        
        // protected - доступен (в том же пакете)
        OuterClass.ProtectedInner prot = outer.new ProtectedInner();
        prot.show();
        
        // default - доступен (в том же пакете)
        OuterClass.DefaultInner di = outer.new DefaultInner();
        di.show();
        
        // private - НЕ доступен (ошибка компиляции)
        // OuterClass.PrivateInner priv = outer.new PrivateInner();
    }
}
