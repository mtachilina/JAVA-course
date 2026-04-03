public enum Level {
    LOW(1, "Низкий"),
    MEDIUM(2, "Средний"),
    HIGH(3, "Высокий");
    
    private int code;
    private String description;
    
    Level(int code, String description) {
        this.code = code;
        this.description = description;
    }
    
    public int getCode() {
        return code;
    }
    
    public String getDescription() {
        return description;
    }
    
    public boolean isHigherThan(Level other) {
        return this.code > other.code;
    }
    
    public static Level fromCode(int code) {
        for (Level level : values()) {
            if (level.code == code) {
                return level;
            }
        }
        return LOW;
    }
    
    public static void main(String[] args) {
        Level myLevel = Level.HIGH;
        
        System.out.println("Уровень: " + myLevel);
        System.out.println("Код: " + myLevel.getCode());
        System.out.println("Описание: " + myLevel.getDescription());
        System.out.println("HIGH > MEDIUM? " + myLevel.isHigherThan(Level.MEDIUM));
        System.out.println("Поиск по коду 2: " + Level.fromCode(2));
    }
}