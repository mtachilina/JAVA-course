public class AccessModifiersExample {
    
    private int privateVar = 1;
    int defaultVar = 2;
    protected int protectedVar = 3;
    public int publicVar = 4;
    
    private void privateMethod() {
        System.out.println("private: только внутри класса");
    }
    
    void defaultMethod() {
        System.out.println("default: внутри пакета");
    }
    
    protected void protectedMethod() {
        System.out.println("protected: пакет + подклассы");
    }
    
    public void publicMethod() {
        System.out.println("public: всем");
    }
    
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