import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        
        // Пример 1: объединение с разделителем
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Яблоко");
        joiner1.add("Банан");
        joiner1.add("Апельсин");
        System.out.println(joiner1);
        
        // Пример 2: с префиксом и суффиксом
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("Красный");
        joiner2.add("Зелёный");
        joiner2.add("Синий");
        System.out.println(joiner2);
        
        // Пример 3: объединение двух StringJoiner
        StringJoiner joiner3 = new StringJoiner(", ");
        joiner3.add("Понедельник");
        joiner3.add("Вторник");
        
        StringJoiner joiner4 = new StringJoiner(", ");
        joiner4.add("Среда");
        joiner4.add("Четверг");
        
        joiner3.merge(joiner4);
        System.out.println(joiner3);
        
        // Пример 4: обработка пустого значения
        StringJoiner empty = new StringJoiner(", ");
        System.out.println("Пустой: " + empty); 
        System.out.println("Пустой с дефолтом: " + empty.toString()); // 
    }
}