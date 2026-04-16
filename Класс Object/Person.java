class Person {
    private String passportId;
    private String name;
    private int age;
    
    public Person(String passportId, String name, int age) {
        this.passportId = passportId;
        this.name = name;
        this.age = age;
    }
    
    @Override
    public boolean equals(Object obj) {
        // 1. Проверка на равенство ссылок
        if (this == obj) {
            return true;
        }
        
        // 2. Проверка на null
        if (obj == null) {
            return false;
        }
        
        // 3. Проверка на совместимость типов
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        // 4. Приведение типа
        Person other = (Person) obj;
        
        // 5. Сравнение значимых полей
        return passportId != null && passportId.equals(other.passportId);
    }
    
    @Override
    public int hashCode() {
        return passportId != null ? passportId.hashCode() : 0;
    }
    
    public static void main(String[] args) {
        Person p1 = new Person("12345", "Иван", 25);
        Person p2 = new Person("12345", "Иван", 25);
        Person p3 = new Person("67890", "Петр", 30);
        
        System.out.println(p1.equals(p2)); 
        System.out.println(p1.equals(p3));
    }
}