import java.util.Date;

public class DateTimeFormatExample {
    public static void main(String[] args) {
        Date now = new Date();
        
        // %tH - час (00-23)
        System.out.printf("Час (00-23): %tH%n", now);
        
        // %tM - минуты (00-59)
        System.out.printf("Минуты: %tM%n", now);
        
        // %tS - секунды (00-59)
        System.out.printf("Секунды: %tS%n", now);
        
        // %tY - год (4 цифры)
        System.out.printf("Год: %tY%n", now);
        
        // %tB - полное название месяца
        System.out.printf("Месяц: %tB%n", now);
        
        // Дополнительно: комбинированный формат
        System.out.printf("Дата и время: %tY-%tm-%td %tH:%tM:%tS%n", now, now, now, now, now, now);
    }
}