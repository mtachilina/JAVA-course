public class MultiCatchExample {
    
    // Иерархия исключений
    static class Ex1 extends Exception { }
    static class Ex2 extends Ex1 { }
    static class Ex3 extends Ex2 { }
    
    public static void main(String[] args) {
        
        // Ситуация 1: несколько исключений обрабатываются идентично (Multi-catch)
        // Исключения не должны быть из одной иерархической цепочки
        try {
            String str = null;
            int[] arr = {1, 2, 3};
            
            if (args.length > 0) {
                System.out.println(arr[5]); 
            } else {
                System.out.println(str.length());
            }
            
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Исключение перехвачено (идентичная обработка): " + e.getClass().getSimpleName());
        }
        
        // Ситуация 2: иерархия исключений
        // catch должны идти от потомка к предку
        try {
            throw new Ex3(); 
        } catch (Ex3 e) {
            System.out.println("Перехвачено Ex3 (самый конкретный)");
        } catch (Ex2 e) {
            System.out.println("Перехвачено Ex2");
        } catch (Ex1 e) {
            System.out.println("Перехвачено Ex1 (самый общий)");
        }
        
        // Неправильный порядок
        /*
        try {
            throw new Ex3();
        } catch (Ex1 e) {      // Предок
            System.out.println("Ex1");
        } catch (Ex3 e) {      // Потомок после предка (ошибка)
            System.out.println("Ex3");
        }
        */
    }
}