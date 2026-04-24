/**
 * Программа для демонстрации преобразований между String, StringBuilder и StringBuffer.
 * 
 * String - неизменяемая строка
 * StringBuilder - изменяемая строка (непотокобезопасный, быстрее)
 * StringBuffer - изменяемая строка (потокобезопасный, медленнее)
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class ConversionExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует все возможные преобразования между тремя типами:
     * 
     * - String → StringBuilder
     * - String → StringBuffer
     * - StringBuilder → String
     * - StringBuffer → String
     * - StringBuilder → StringBuffer
     * - StringBuffer → StringBuilder
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Преобразование String → StringBuilder
        // Используется конструктор StringBuilder(String)
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("String → StringBuilder: " + sb);
        
        // Преобразование String → StringBuffer
        // Используется конструктор StringBuffer(String)
        StringBuffer sbf = new StringBuffer(str);
        System.out.println("String → StringBuffer: " + sbf);
        
        // Преобразование StringBuilder → String
        // Используется метод toString()
        StringBuilder sb2 = new StringBuilder("Java");
        String strFromSb = sb2.toString();
        System.out.println("StringBuilder → String: " + strFromSb);
        
        // Преобразование StringBuffer → String
        // Используется метод toString()
        StringBuffer sbf2 = new StringBuffer("World");
        String strFromSbf = sbf2.toString();
        System.out.println("StringBuffer → String: " + strFromSbf);
        
        // Преобразование StringBuilder → StringBuffer
        // Используется конструктор StringBuffer(StringBuilder)
        StringBuilder sb3 = new StringBuilder("Convert");
        StringBuffer sbf3 = new StringBuffer(sb3);
        System.out.println("StringBuilder → StringBuffer: " + sbf3);
        
        // Преобразование StringBuffer → StringBuilder
        // Используется конструктор StringBuilder(StringBuffer)
        StringBuffer sbf4 = new StringBuffer("Back");
        StringBuilder sb4 = new StringBuilder(sbf4);
        System.out.println("StringBuffer → StringBuilder: " + sb4);
    }
}
