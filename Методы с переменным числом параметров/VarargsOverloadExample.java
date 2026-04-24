/**
 * Программа для демонстрации перегрузки методов с переменным числом параметров (varargs).
 * 
 * Varargs (variable arguments) обозначается троеточием ...
 * Позволяет передавать произвольное количество аргументов одного типа.
 * 
 * Правила:
 * - varargs параметр должен быть последним в списке
 * - в методе может быть только один varargs параметр
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class VarargsOverloadExample {
    
    /**
     * Метод с varargs типа int.
     * 
     * @param numbers произвольное количество целых чисел
     */
    public void print(int... numbers) {
        System.out.print("int...: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    /**
     * Метод с varargs типа String.
     * 
     * @param strings произвольное количество строк
     */
    public void print(String... strings) {
        System.out.print("String...: ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
    
    /**
     * Метод с обычным параметром и varargs.
     * varargs должен быть последним параметром.
     * 
     * @param first первый целочисленный параметр
     * @param rest произвольное количество строк
     */
    public void printIntAndString(int first, String... rest) {
        System.out.print("int + String...: " + first + " -> ");
        for (String str : rest) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
    
    /**
     * Метод с double и varargs типа int.
     * 
     * @param first первый параметр с плавающей точкой
     * @param rest произвольное количество целых чисел
     */
    public void printDoubleAndInt(double first, int... rest) {
        System.out.print("double + int...: " + first + " -> ");
        for (int num : rest) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    /**
     * Главный метод программы.
     * Демонстрирует вызов перегруженных varargs методов.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        VarargsOverloadExample obj = new VarargsOverloadExample();
        
        obj.print(1, 2, 3, 4);           // вызов int... версии
        obj.print("A", "B", "C");        // вызов String... версии
        obj.printIntAndString(10, "Hello", "World");
        obj.printDoubleAndInt(3.14, 5, 6, 7);
    }
}
