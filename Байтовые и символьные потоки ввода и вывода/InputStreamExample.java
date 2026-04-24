import java.io.FileInputStream;
import java.io.IOException;

/**
 * Программа для демонстрации работы метода read() класса InputStream.
 * 
 * InputStream - абстрактный класс для всех байтовых потоков ввода.
 * FileInputStream - его подкласс для чтения данных из файла.
 * 
 * Метод read():
 * - читает один байт данных из входного потока
 * - возвращает int (0-255) или -1 при достижении конца файла
 * - при ошибке выбрасывает IOException
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class InputStreamExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует чтение файла побайтово с использованием FileInputStream.
     * 
     * Программа:
     * 1. Открывает файл "test.txt" для чтения
     * 2. Поочерёдно читает байты из файла
     * 3. Выводит каждый байт как символ
     * 4. Завершает чтение при достижении конца файла (read() возвращает -1)
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // try-with-resources гарантирует автоматическое закрытие потока
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            
            int data;
            
            // read() читает один байт, возвращает -1 при достижении конца файла
            while ((data = fis.read()) != -1) {
                // Преобразуем байт в символ и выводим
                System.out.print((char) data);
            }
            
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
