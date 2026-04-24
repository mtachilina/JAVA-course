/**
 * Перечисление (enum) с инициализацией элементов.
 * 
 * Каждая константа перечисления инициализируется через конструктор
 * с указанием массы и радиуса планеты.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public enum Planet {
    
    MERCURY(3.30e23, 2.44e6),
    VENUS(4.87e24, 6.05e6),
    EARTH(5.97e24, 6.38e6),
    MARS(6.42e23, 3.40e6);
    
    private final double mass;    // масса планеты в кг
    private final double radius;  // радиус планеты в метрах
    
    /**
     * Конструктор перечисления.
     * Всегда имеет private доступ (по умолчанию).
     * 
     * @param mass масса планеты
     * @param radius радиус планеты
     */
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    
    /**
     * Возвращает массу планеты.
     * 
     * @return масса в кг
     */
    public double getMass() {
        return mass;
    }
    
    /**
     * Возвращает радиус планеты.
     * 
     * @return радиус в метрах
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Главный метод для демонстрации работы перечисления.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println("Земля: масса = " + EARTH.getMass() + " кг");
        System.out.println("Марс: радиус = " + MARS.getRadius() + " м");
    }
}
