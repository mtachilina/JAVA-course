public class ConversionExample {
    public static void main(String[] args) {
        
        // String -> StringBuilder 
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("String → StringBuilder: " + sb);
        
        // String -> StringBuffer 
        StringBuffer sbf = new StringBuffer(str);
        System.out.println("String → StringBuffer: " + sbf);
        
        // StringBuilder -> String 
        StringBuilder sb2 = new StringBuilder("Java");
        String strFromSb = sb2.toString();
        System.out.println("StringBuilder → String: " + strFromSb);
        
        // StringBuffer -> String
        StringBuffer sbf2 = new StringBuffer("World");
        String strFromSbf = sbf2.toString();
        System.out.println("StringBuffer → String: " + strFromSbf);
        
        // StringBuilder -> StringBuffer
        StringBuilder sb3 = new StringBuilder("Convert");
        StringBuffer sbf3 = new StringBuffer(sb3);
        System.out.println("StringBuilder → StringBuffer: " + sbf3);
        
        // StringBuffer -> StringBuilder 
        StringBuffer sbf4 = new StringBuffer("Back");
        StringBuilder sb4 = new StringBuilder(sbf4);
        System.out.println("StringBuffer → StringBuilder: " + sb4);
    }
}