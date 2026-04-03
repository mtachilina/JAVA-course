public enum Planet {
    MERCURY(3.30e23, 2.44e6),
    VENUS(4.87e24, 6.05e6),
    EARTH(5.97e24, 6.38e6),
    MARS(6.42e23, 3.40e6);
    
    private final double mass;
    private final double radius;
    
    // Конструктор перечисления (всегда private)
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    
    public double getMass() {
        return mass;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public static void main(String[] args) {
        System.out.println("Земля: масса = " + EARTH.getMass() + " кг");
        System.out.println("Марс: радиус = " + MARS.getRadius() + " м");
    }
}