public class Outer {
    private int privateField = 1;
    public int publicField = 2;
    protected int protectedField = 3;
    int defaultField = 4;
    
    private void privateMethod() {
        System.out.println("Private method");
    }
    
    public class Inner {
        public void accessOuterFields() {
            System.out.println("privateField = " + privateField); 
            System.out.println("publicField = " + publicField);  
            System.out.println("protectedField = " + protectedField); 
            System.out.println("defaultField = " + defaultField);   
            
            privateMethod();
        }
    }
    
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.accessOuterFields();
    }
}