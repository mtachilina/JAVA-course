import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileExample {
    public static void main(String[] args) {
        
        // Способ 1: чтение файла построчно
        try (Scanner scanner = new Scanner(new File("input.txt"))) {
            System.out.println("Чтение построчно");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
        
        // Способ 2: чтение с разбором типов данных
        try (Scanner scanner = new Scanner(new File("data.txt"))) {
            System.out.println("\nЧтение типизированных данных ");
            
            // Чтение целых чисел
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println("Число: " + number);
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
        
        // Способ 3: чтение с разделителями
        try (Scanner scanner = new Scanner(new File("csv.txt"))) {
            System.out.println("\nЧтение с разделителями");
            scanner.useDelimiter("[,\\s]+"); // разделители: запятая или пробел
            
            while (scanner.hasNext()) {
                String token = scanner.next();
                System.out.println("Токен: " + token);
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
        
        // Способ 4: чтение с указанием кодировки
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