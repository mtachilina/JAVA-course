import java.util.Arrays;

/**
 * Программа для демонстрации основных методов класса java.util.Arrays.
 * 
 * Класс Arrays предоставляет удобные методы для работы с массивами:
 * - toString() - преобразование массива в строку
 * - sort() - сортировка массива
 * - binarySearch() - бинарный поиск элемента
 * - equals() - сравнение массивов
 * - compare() - лексикографическое сравнение
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class ArraysUtilExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует работу основных методов класса Arrays.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Исходный массив
        int[] numbers = {5, 2, 8, 1, 9};
        
        // toString - преобразует массив в строку для удобного вывода
        System.out.println("toString: " + Arrays.toString(numbers));
        
        // sort - сортирует массив по возрастанию
        Arrays.sort(numbers);
        System.out.println("sort: " + Arrays.toString(numbers));
        
        // binarySearch - ищет элемент в отсортированном массиве
        // возвращает индекс элемента или отрицательное число
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("binarySearch 8: " + index);
        
        // equals - сравнивает два массива на равенство
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println("equals: " + Arrays.equals(arr1, arr2));
        
        // compare - лексикографическое сравнение массивов
        // возвращает 0 если равны, отрицательное или положительное число
        System.out.println("compare: " + Arrays.compare(arr1, arr2));
    }
}
