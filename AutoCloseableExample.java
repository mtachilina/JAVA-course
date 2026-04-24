import java.io.FileInputStream;
import java.io.IOException;

public class AutoCloseableExample {
    
    static class MyResource implements AutoCloseable {
        
        public void doWork() {
            System.out.println("Работа с ресурсом");
        }
        
        @Override
        public void close() throws Exception {
            System.out.println("Ресурс закрыт автоматически");
        }
    }
    
    public static void main(String[] args) {
        
        // Пример 1: try-with-resources (AutoCloseable)
        try (MyResource resource = new MyResource()) {
            resource.doWork();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // Пример 2: с FileInputStream (тоже AutoCloseable)
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            int data = fis.read();
            System.out.println("Прочитан байт: " + data);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // Пример 3: без try-with-resources (пришлось бы закрывать вручную)
        FileInputStream fis2 = null;
        try {
            fis2 = new FileInputStream("test.txt");
            fis2.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis2 != null) {
                try {
                    fis2.close(); 
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}