import java.io.FileInputStream;
import java.io.IOException;

/**
 * Программа для демонстрации интерфейса AutoCloseable и конструкции try-with-resources.
 * 
 * AutoCloseable позволяет использовать ресурсы, которые нужно закрывать,
 * в конструкции try-with-resources. Это гарантирует автоматическое закрытие
 * ресурса после выхода из блока try, даже при возникновении исключения.
 * 
 * Преимущества:
 * - Не нужно писать finally блок
 * - Ресурс закрывается автоматически
 * - Код становится чище и безопаснее
 * - Невозможно забыть закрыть ресурс
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class AutoCloseableExample {
    
    /**
     * Собственный класс, реализующий AutoCloseable.
     * Демонстрирует автоматическое закрытие ресурса.
     */
    static class MyResource implements AutoCloseable {
        
        /**
         * Работа с ресурсом.
         */
        public void doWork() {
            System.out.println("Работа с ресурсом");
        }
        
        /**
         * Метод close() вызывается автоматически при выходе из try-with-resources.
         * 
         * @throws Exception возможные исключения при закрытии
         */
        @Override
        public void close() throws Exception {
            System.out.println("Ресурс закрыт автоматически");
        }
    }
    
    /**
     * Главный метод программы.
     * Демонстрирует три подхода к работе с ресурсами:
     * 
     * 1. try-with-resources с собственным AutoCloseable ресурсом
     * 2. try-with-resources с FileInputStream
     * 3. Ручное закрытие ресурса в finally (устаревший подход)
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        // Пример 1: try-with-resources с собственным AutoCloseable ресурсом
        // Ресурс закроется автоматически после выхода из блока try
        try (MyResource resource = new MyResource()) {
            resource.doWork();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // Пример 2: try-with-resources с FileInputStream (Java IO классы реализуют AutoCloseable)
        // При возникновении исключения или после выхода из try - fis закроется автоматически
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            int data = fis.read();
            System.out.println("Прочитан байт: " + data);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // Пример 3: старый способ - ручное закрытие ресурса в finally
        // Много кода, легко ошибиться и забыть закрыть ресурс
        FileInputStream fis2 = null;
        try {
            fis2 = new FileInputStream("test.txt");
            fis2.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis2 != null) {
                try {
                    fis2.close();  // ручное закрытие
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
