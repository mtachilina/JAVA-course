/**
 * Перечисление (enum) с инициализацией элементов и дополнительными методами.
 * 
 * Перечисления в Java позволяют задавать фиксированный набор констант.
 * Каждая константа может иметь свои поля и конструктор.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public enum Level {
    
    LOW(1, "Низкий"),
    MEDIUM(2, "Средний"),
    HIGH(3, "Высокий");
    
    private int code;
    private String description;
    
    /**
     * Конструктор перечисления (всегда private).
     * 
     * @param code числовой код уровня
     * @param description текстовое описание уровня
     */
    Level(int code, String description) {
        this.code = code;
        this.description = description;
    }
    
    /**
     * Возвращает числовой код уровня.
     * 
     * @return код уровня
     */
    public int getCode() {
        return code;
    }
    
    /**
     * Возвращает текстовое описание уровня.
     * 
     * @return описание уровня
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Проверяет, является ли текущий уровень выше другого.
     * 
     * @param other другой уровень для сравнения
     * @return true если текущий уровень выше
     */
    public boolean isHigherThan(Level other) {
        return this.code > other.code;
    }
    
    /**
     * Находит уровень по числовому коду.
     * 
     * @param code числовой код
     * @return найденный уровень или LOW по умолчанию
     */
    public static Level fromCode(int code) {
        for (Level level : values()) {
            if (level.code == code) {
                return level;
            }
        }
        return LOW;
    }
    
    /**
     * Главный метод для демонстрации работы перечисления.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Level myLevel = Level.HIGH;
        
        System.out.println("Уровень: " + myLevel);
        System.out.println("Код: " + myLevel.getCode());
        System.out.println("Описание: " + myLevel.getDescription());
        System.out.println("HIGH > MEDIUM? " + myLevel.isHigherThan(Level.MEDIUM));
        System.out.println("Поиск по коду 2: " + Level.fromCode(2));
    }
}
