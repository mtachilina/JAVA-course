import java.util.Scanner;
import java.io.UnsupportedEncodingException;
import java.io.PrintStream;

public class hello_name {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner scan = null;
        try {
            scan = new Scanner(System.in, "UTF-8");
            System.out.print("Введите ваше имя: ");
            String name = scan.next();
            System.out.println("Привет, " + name);
        } catch (Exception e) {
            System.out.println("Ошибка при вводе: " + e.getMessage());
        } finally {
            if (scan != null) {
                scan.close();
            }
        }
    }
}