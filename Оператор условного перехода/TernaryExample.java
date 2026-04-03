public class TernaryExample {
    public static void main(String[] args) {
        int a = 1;
        int i = (a == 1) ? 1 : (a == 2) ? 2 : 3;
        System.out.println("a = " + a + ", i = " + i);
        
        a = 2;
        i = (a == 1) ? 1 : (a == 2) ? 2 : 3;
        System.out.println("a = " + a + ", i = " + i);
        
        a = 5;
        i = (a == 1) ? 1 : (a == 2) ? 2 : 3;
        System.out.println("a = " + a + ", i = " + i);
    }
}