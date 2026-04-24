import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Программа для демонстрации чтения данных из файла с помощью Scanner.
 * 
 * Scanner предоставляет удобные методы для разбора текстовых данных:
 * - nextLine() - чтение строки
 * - nextInt() - чтение целого числа
 * - next() - чтение следующего токена
 * - hasNextLine(), hasNextInt(), hasNext() - проверка наличия данных
 * - useDelimiter() - установка разделителя
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class ScannerFileExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует четыре способа чтения файлов с помощью Scanner:
     * 
     * 1. Построчное чтение текстового файла
     * 2. Чтение типизированных данных (целые числа)
     * 3. Чтение с использованием кастомного разделителя
     * 4. Чтение с указанием кодировки UTF-8
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Способ 1: построчное чтение файла
        // nextLine() - читает всю строку до символа перевода строки
        try (Scanner scanner = new Scanner(new File("input.txt"))) {
            System.out.println("Чтение построчно");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
        
        // Способ 2: чтение типизированных данных
        // hasNextInt() - проверяет, можно ли прочитать int
        // nextInt() - читает целое число
        try (Scanner scanner = new Scanner(new File("data.txt"))) {
            System.out.println("\nЧтение типизированных данных ");
            
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println("Число: " + number);
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
        
        // Способ 3: чтение с разделителями
        // useDelimiter() - устанавливает регулярное выражение для разделителя
        // [,\\s]+ - один или более символов: запятая или пробел
        try (Scanner scanner = new Scanner(new File("csv.txt"))) {
            System.out.println("\nЧтение с разделителями");
            scanner.useDelimiter("[,\\s]+");
            
            while (scanner.hasNext()) {
                String token = scanner.next();
                System.out.println("Токен: " + token);
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
        
        // Способ 4: чтение с указанием кодировки
        // Второй параметр конструктора - кодировка файла (UTF-8)
        try (Scanner scanner = new Scanner(new File("utf8.txt"), "UTF-8")) {
            System.out.println("\nЧтение с кодировкой UTF-8");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
    }
}
