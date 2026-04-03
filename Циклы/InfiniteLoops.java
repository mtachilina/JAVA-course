public class InfiniteLoops {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Бесконечный while");
            break;
        }
        
        do {
            System.out.println("Бесконечный do-while");
            break;
        } while (true);
    }
}