public class OuterClass {
    
    // public - доступен всем
    public class PublicInner {
        public void show() {
            System.out.println("Public inner class");
        }
    }
    
    // protected - доступен в пакете и подклассам
    protected class ProtectedInner {
        public void show() {
            System.out.println("Protected inner class");
        }
    }
    
    // default (без спецификатора) - доступен только в пакете
    class DefaultInner {
        public void show() {
            System.out.println("Default inner class");
        }
    }
    
    // private - доступен только внутри OuterClass
    private class PrivateInner {
        public void show() {
            System.out.println("Private inner class");
        }
    }
    
    public void testInner() {
        // Внутри внешнего класса доступны все
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

// В другом классе того же пакета
class SamePackageTest {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        
        OuterClass.PublicInner pi = outer.new PublicInner();     // доступен
        OuterClass.ProtectedInner prot = outer.new ProtectedInner(); // доступен
        OuterClass.DefaultInner di = outer.new DefaultInner();   // доступен
        // OuterClass.PrivateInner priv = outer.new PrivateInner(); // ошибка
    }
}