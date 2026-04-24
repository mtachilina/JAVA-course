/**
 * Программа для демонстрации методов StringBuilder и StringBuffer.
 * 
 * StringBuilder и StringBuffer - изменяемые строки.
 * Отличие: StringBuffer потокобезопасный (синхронизированный),
 *          StringBuilder непотокобезопасный (быстрее).
 * 
 * Основные методы:
 * - append() - добавление в конец
 * - insert() - вставка по индексу
 * - delete() - удаление диапазона
 * - deleteCharAt() - удаление символа
 * - replace() - замена диапазона
 * - reverse() - переворот строки
 * - length() - длина строки
 * - charAt() - символ по индексу
 * - setCharAt() - замена символа
 * - substring() - получение подстроки
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class StringBuilderStringBufferExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует 10 методов StringBuilder и 10 методов StringBuffer.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        System.out.println("STRINGBUILDER");
        
        // StringBuilder (непотокобезопасный, но быстрее)
        StringBuilder sb = new StringBuilder("Hello");
        
        // append() - добавляет строку в конец
        sb.append(" World");
        System.out.println("1. append: " + sb);
        
        // insert() - вставляет строку по указанному индексу
        sb.insert(5, " Java");
        System.out.println("2. insert: " + sb);
        
        // delete() - удаляет символы с start до end
        sb.delete(5, 10);
        System.out.println("3. delete: " + sb);
        
        // deleteCharAt() - удаляет символ по индексу
        sb.deleteCharAt(5);
        System.out.println("4. deleteCharAt: " + sb);
        
        // replace() - заменяет часть строки
        sb.replace(0, 5, "Hi");
        System.out.println("5. replace: " + sb);
        
        // reverse() - переворачивает строку
        sb.reverse();
        System.out.println("6. reverse: " + sb);
        
        // length() - возвращает длину строки
        System.out.println("7. length: " + sb.length());
        
        // charAt() - возвращает символ по индексу
        System.out.println("8. charAt(0): " + sb.charAt(0));
        
        // setCharAt() - заменяет символ по индексу
        sb.setCharAt(0, 'D');
        System.out.println("9. setCharAt: " + sb);
        
        // substring() - возвращает подстроку
        System.out.println("10. substring(0,5): " + sb.substring(0, 5));
        
        
        System.out.println("\nSTRINGBUFFER");
        
        // StringBuffer (потокобезопасный, но медленнее)
        StringBuffer sbf = new StringBuffer("Hello");
        
        // append() - добавляет строку в конец
        sbf.append(" World");
        System.out.println("1. append: " + sbf);
        
        // insert() - вставляет строку по указанному индексу
        sbf.insert(5, " Java");
        System.out.println("2. insert: " + sbf);
        
        // delete() - удаляет символы с start до end
        sbf.delete(5, 10);
        System.out.println("3. delete: " + sbf);
        
        // deleteCharAt() - удаляет символ по индексу
        sbf.deleteCharAt(5);
        System.out.println("4. deleteCharAt: " + sbf);
        
        // replace() - заменяет часть строки
        sbf.replace(0, 5, "Hi");
        System.out.println("5. replace: " + sbf);
        
        // reverse() - переворачивает строку
        sbf.reverse();
        System.out.println("6. reverse: " + sbf);
        
        // length() - возвращает длину строки
        System.out.println("7. length: " + sbf.length());
        
        // charAt() - возвращает символ по индексу
        System.out.println("8. charAt(0): " + sbf.charAt(0));
        
        // setCharAt() - заменяет символ по индексу
        sbf.setCharAt(0, 'D');
        System.out.println("9. setCharAt: " + sbf);
        
        // substring() - возвращает подстроку
        System.out.println("10. substring(0,5): " + sbf.substring(0, 5));
    }
}
