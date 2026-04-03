public class NullPointerExample {
    public static void main(String[] args) {
        
        //1
        Integer nullInteger = null;

        try {
            int value = nullInteger;
            System.out.println(value);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: nullInteger не может быть распакован");
        }
        
        //2
        Integer normalInteger = null;
        
        //3
        Integer a = null;
        Integer b = 10;
        
        try {
            int result = a + b;
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: при сложении a (null) + b");
        }
        
        //4
        Integer x = null;
        if (x == 5) {
            System.out.println("равно");
        } else {
            System.out.println("не равно");
        }
    }
}