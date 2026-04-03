public class BooleanCreationExample {
    public static void main(String[] args) {
        
        //1
        Boolean bool1 = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf(false);
        System.out.println("Boolean.valueOf(true): " + bool1);
        System.out.println("Boolean.valueOf(false): " + bool2);
        
        //2
        Boolean bool3 = Boolean.valueOf("true");
        Boolean bool4 = Boolean.valueOf("false");
        Boolean bool5 = Boolean.valueOf("TRUE");    
        Boolean bool6 = Boolean.valueOf("False");   
        Boolean bool7 = Boolean.valueOf("anything"); 
        System.out.println("\nBoolean.valueOf(\"true\"): " + bool3);
        System.out.println("Boolean.valueOf(\"false\"): " + bool4);
        System.out.println("Boolean.valueOf(\"TRUE\"): " + bool5);
        System.out.println("Boolean.valueOf(\"anything\"): " + bool7);
        
        //3
        boolean primitive1 = Boolean.parseBoolean("true");
        boolean primitive2 = Boolean.parseBoolean("false");
        System.out.println("\nBoolean.parseBoolean(\"true\"): " + primitive1);
        System.out.println("Boolean.parseBoolean(\"false\"): " + primitive2);
        
        //4
        Boolean bool8 = true;
        Boolean bool9 = false;
        System.out.println("\nАвтоупаковка: true -> " + bool8);
        
        //5
        @SuppressWarnings("deprecation")
        Boolean bool10 = new Boolean(true);
        System.out.println("new Boolean(true): " + bool10);
    }
}