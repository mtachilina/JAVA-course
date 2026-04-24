public class StringBuilderStringBufferExample {
    public static void main(String[] args) {
        
        System.out.println("STRINGBUILDER");
        
        // StringBuilder (непотокобезопасный, но быстрее)
        StringBuilder sb = new StringBuilder("Hello");
        
        // 1. append() - добавляет строку
        sb.append(" World");
        System.out.println("1. append: " + sb); // Hello World
        
        // 2. insert() - вставляет по индексу
        sb.insert(5, " Java");
        System.out.println("2. insert: " + sb); // Hello Java World
        
        // 3. delete() - удаляет диапазон
        sb.delete(5, 10);
        System.out.println("3. delete: " + sb); // Hello World
        
        // 4. deleteCharAt() - удаляет символ
        sb.deleteCharAt(5);
        System.out.println("4. deleteCharAt: " + sb); // HelloWorld
        
        // 5. replace() - заменяет диапазон
        sb.replace(0, 5, "Hi");
        System.out.println("5. replace: " + sb); // HiWorld
        
        // 6. reverse() - переворачивает
        sb.reverse();
        System.out.println("6. reverse: " + sb); // dlroW iH
        
        // 7. length() - длина строки
        System.out.println("7. length: " + sb.length()); // 9
        
        // 8. charAt() - символ по индексу
        System.out.println("8. charAt(0): " + sb.charAt(0)); // d
        
        // 9. setCharAt() - меняет символ
        sb.setCharAt(0, 'D');
        System.out.println("9. setCharAt: " + sb); // DlroW iH
        
        // 10. substring() - подстрока
        System.out.println("10. substring(0,5): " + sb.substring(0, 5)); // DlroW
        
        
        System.out.println("\nSTRINGBUFFER");
        
        // StringBuffer (потокобезопасный, но медленнее)
        StringBuffer sbf = new StringBuffer("Hello");
        
        // 1. append() - добавляет строку
        sbf.append(" World");
        System.out.println("1. append: " + sbf); // Hello World
        
        // 2. insert() - вставляет по индексу
        sbf.insert(5, " Java");
        System.out.println("2. insert: " + sbf); // Hello Java World
        
        // 3. delete() - удаляет диапазон
        sbf.delete(5, 10);
        System.out.println("3. delete: " + sbf); // Hello World
        
        // 4. deleteCharAt() - удаляет символ
        sbf.deleteCharAt(5);
        System.out.println("4. deleteCharAt: " + sbf); // HelloWorld
        
        // 5. replace() - заменяет диапазон
        sbf.replace(0, 5, "Hi");
        System.out.println("5. replace: " + sbf); // HiWorld
        
        // 6. reverse() - переворачивает
        sbf.reverse();
        System.out.println("6. reverse: " + sbf); // dlroW iH
        
        // 7. length() - длина строки
        System.out.println("7. length: " + sbf.length()); // 9
        
        // 8. charAt() - символ по индексу
        System.out.println("8. charAt(0): " + sbf.charAt(0)); // d
        
        // 9. setCharAt() - меняет символ
        sbf.setCharAt(0, 'D');
        System.out.println("9. setCharAt: " + sbf); // DlroW iH
        
        // 10. substring() - подстрока
        System.out.println("10. substring(0,5): " + sbf.substring(0, 5)); // DlroW
    }
}