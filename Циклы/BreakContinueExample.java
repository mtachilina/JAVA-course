/**
 * Программа для демонстрации операторов break и continue в циклах.
 * 
 * break - полностью прекращает выполнение цикла.
 * continue - пропускает текущую итерацию и переходит к следующей.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class BreakContinueExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует работу break и continue на примере цикла for.
     * 
     * При break: цикл останавливается при достижении i = 5.
     * При continue: выводятся все числа от 1 до 10 кроме 5.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        System.out.println(" break");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;   // выход из цикла при i = 5
            }
            System.out.print(i + " ");
        }
        
        System.out.println("\n continue");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;   // пропуск итерации при i = 5
            }
            System.out.print(i + " ");
        }
    }
}
