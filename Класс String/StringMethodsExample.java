public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "  Hello Java World  ";
        String another = "hello java world";
        
        // 1. length() - возвращает длину строки
        System.out.println("1. length(): " + str.length()); // 19
        
        // 2. charAt() - возвращает символ по индексу
        System.out.println("2. charAt(6): " + str.charAt(6)); // 'J'
        
        // 3. substring() - возвращает подстроку
        System.out.println("3. substring(2,7): " + str.substring(2, 7)); // "Hello"
        
        // 4. trim() - удаляет пробелы в начале и конце
        System.out.println("4. trim(): '" + str.trim() + "'"); // "Hello Java World"
        
        // 5. toLowerCase() - преобразует в нижний регистр
        System.out.println("5. toLowerCase(): " + str.toLowerCase()); // "  hello java world  "
        
        // 6. toUpperCase() - преобразует в верхний регистр
        System.out.println("6. toUpperCase(): " + str.toUpperCase()); // "  HELLO JAVA WORLD  "
        
        // 7. equals() - сравнивает строки с учётом регистра
        System.out.println("7. equals(): " + str.trim().equals(another)); // false
        
        // 8. equalsIgnoreCase() - сравнивает строки без учёта регистра
        System.out.println("8. equalsIgnoreCase(): " + str.trim().equalsIgnoreCase(another)); // true
        
        // 9. contains() - проверяет наличие подстроки
        System.out.println("9. contains(\"Java\"): " + str.contains("Java")); // true
        
        // 10. replace() - заменяет символы или подстроки
        System.out.println("10. replace('o', '0'): " + str.replace('o', '0')); // "  Hell0 Java W0rld  "
        
        // 11. split() - разбивает строку на массив
        String[] words = str.trim().split(" ");
        System.out.println("11. split(): " + java.util.Arrays.toString(words)); // [Hello, Java, World]
        
        // 12. isEmpty() - проверяет пустая ли строка
        System.out.println("12. isEmpty(): " + "".isEmpty()); // true
        
        // 13. indexOf() - возвращает индекс первого вхождения
        System.out.println("13. indexOf('a'): " + str.indexOf('a')); // 9
        
        // 14. lastIndexOf() - возвращает индекс последнего вхождения
        System.out.println("14. lastIndexOf('o'): " + str.lastIndexOf('o')); // 12
        
        // 15. startsWith() - проверяет начинается ли с подстроки
        System.out.println("15. startsWith(\"  He\"): " + str.startsWith("  He")); // true
    }
}