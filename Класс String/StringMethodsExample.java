/**
 * Программа для демонстрации методов класса String.
 * 
 * Класс String предоставляет множество методов для работы со строками:
 * - получение информации о строке (длина, символ по индексу)
 * - преобразование строки (trim, toLowerCase, toUpperCase, replace)
 * - сравнение строк (equals, equalsIgnoreCase)
 * - поиск в строке (contains, indexOf, lastIndexOf, startsWith)
 * - извлечение подстроки (substring)
 * - разбиение на части (split)
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class StringMethodsExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует 15 основных методов класса String.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        String str = "  Hello Java World  ";
        String another = "hello java world";
        
        // length() - возвращает длину строки (количество символов)
        System.out.println("1. length(): " + str.length());
        
        // charAt() - возвращает символ по указанному индексу
        System.out.println("2. charAt(6): " + str.charAt(6));
        
        // substring() - возвращает подстроку от beginIndex до endIndex
        System.out.println("3. substring(2,7): " + str.substring(2, 7));
        
        // trim() - удаляет пробельные символы в начале и конце строки
        System.out.println("4. trim(): '" + str.trim() + "'");
        
        // toLowerCase() - преобразует все символы строки в нижний регистр
        System.out.println("5. toLowerCase(): " + str.toLowerCase());
        
        // toUpperCase() - преобразует все символы строки в верхний регистр
        System.out.println("6. toUpperCase(): " + str.toUpperCase());
        
        // equals() - сравнивает строки с учётом регистра
        System.out.println("7. equals(): " + str.trim().equals(another));
        
        // equalsIgnoreCase() - сравнивает строки без учёта регистра
        System.out.println("8. equalsIgnoreCase(): " + str.trim().equalsIgnoreCase(another));
        
        // contains() - проверяет, содержит ли строка указанную подстроку
        System.out.println("9. contains(\"Java\"): " + str.contains("Java"));
        
        // replace() - заменяет все вхождения символа (или подстроки)
        System.out.println("10. replace('o', '0'): " + str.replace('o', '0'));
        
        // split() - разбивает строку на массив подстрок по разделителю
        String[] words = str.trim().split(" ");
        System.out.println("11. split(): " + java.util.Arrays.toString(words));
        
        // isEmpty() - проверяет, пустая ли строка (длина равна 0)
        System.out.println("12. isEmpty(): " + "".isEmpty());
        
        // indexOf() - возвращает индекс первого вхождения символа
        System.out.println("13. indexOf('a'): " + str.indexOf('a'));
        
        // lastIndexOf() - возвращает индекс последнего вхождения символа
        System.out.println("14. lastIndexOf('o'): " + str.lastIndexOf('o'));
        
        // startsWith() - проверяет, начинается ли строка с указанной подстроки
        System.out.println("15. startsWith(\"  He\"): " + str.startsWith("  He"));
    }
}
