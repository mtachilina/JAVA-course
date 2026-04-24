class MyFirstException extends Exception {
    
    public MyFirstException() {
        super("Моё первое исключение");
    }
    
    public MyFirstException(String message) {
        super(message);
    }
    
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class CustomExceptionExample {
    
    public static void testMethod() throws MyFirstException {
        throw new MyFirstException("Что-то пошло не так");
    }
    
    public static void main(String[] args) {
        try {
            testMethod();
        } catch (MyFirstException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }
        
        try {
            throw new MyFirstException();
        } catch (MyFirstException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }
    }
}