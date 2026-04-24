public class ExceptionHandlingExample {
    
    public static void causeException() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);
    }

    public static void handleException() {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }
        System.out.println("Код после try-catch продолжает работу");
    }
    
    public static void main(String[] args) {
        
        System.out.println("Перехваченное исключение");
        handleException(); 
        System.out.println();
        
        System.out.println("Неперехваченное исключение");
        causeException(); // остановка
        System.out.println("Этот код НЕ выполнится");
    }
}