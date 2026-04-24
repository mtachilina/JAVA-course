import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Программа для демонстрации работы метода write(int) класса OutputStream.
 * 
 * OutputStream - абстрактный класс для всех байтовых потоков вывода.
 * FileOutputStream - его подкласс для записи данных в файл.
 * 
 * Метод write(int):
 * - записывает один байт в выходной поток
 * - принимает int, но записывает только младший байт (8 бит)
 * - при ошибке выбрасывает IOException
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class OutputStreamExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует запись в файл с использованием FileOutputStream.
     * 
     * Программа:
     * 1. Открывает файл "output.txt" для записи
     * 2. Записывает строку "Hello, World!" посимвольно
     * 3. Записывает символ новой строки
     * 4. Записывает символ 'A' (код 65)
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // try-with-resources гарантирует автоматическое закрытие потока
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            
            String text = "Hello, World!";
            
            // Записываем строку посимвольно
            for (char c : text.toCharArray()) {
                // write(int) записывает один байт
                // char преобразуется в int (код символа)
                fos.write((int) c);
            }
            
            // Записываем символ новой строки
            fos.write('\n');
            
            // Записываем символ по его коду
            // 65 - это код символа 'A'
            fos.write(65);
            
            System.out.println("Данные успешно записаны в файл output.txt");
            
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }
    }
}
