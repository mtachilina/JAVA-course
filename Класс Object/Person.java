/**
 * Программа для демонстрации переопределения метода equals().
 * 
 * Соглашения, которым должен следовать метод equals():
 * 1. Рефлексивность - x.equals(x) должен возвращать true
 * 2. Симметричность - если x.equals(y) == true, то y.equals(x) == true
 * 3. Транзитивность - если x.equals(y) и y.equals(z), то x.equals(z)
 * 4. Постоянство - многократный вызов даёт одинаковый результат
 * 5. Сравнение с null - x.equals(null) должен возвращать false
 * 
 * Важно: при переопределении equals() всегда нужно переопределять hashCode()
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
class Person {
    private String passportId;
    private String name;
    private int age;
    
    /**
     * Конструктор класса Person.
     * 
     * @param passportId уникальный идентификатор
     * @param name имя человека
     * @param age возраст
     */
    public Person(String passportId, String name, int age) {
        this.passportId = passportId;
        this.name = name;
        this.age = age;
    }
    
    /**
     * Переопределение метода equals.
     * Сравнение объектов по полю passportId.
     * 
     * @param obj объект для сравнения
     * @return true если объекты равны
     */
    @Override
    public boolean equals(Object obj) {
        // Шаг 1: проверка на равенство ссылок (один и тот же объект)
        if (this == obj) {
            return true;
        }
        
        // Шаг 2: проверка на null
        if (obj == null) {
            return false;
        }
        
        // Шаг 3: проверка на совместимость типов
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        // Шаг 4: приведение типа
        Person other = (Person) obj;
        
        // Шаг 5: сравнение значимых полей
        return passportId != null && passportId.equals(other.passportId);
    }
    
    /**
     * Переопределение метода hashCode.
     * Всегда должен быть согласован с equals().
     * 
     * @return хэш-код объекта
     */
    @Override
    public int hashCode() {
        return passportId != null ? passportId.hashCode() : 0;
    }
    
    /**
     * Главный метод для демонстрации работы equals.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Person p1 = new Person("12345", "Иван", 25);
        Person p2 = new Person("12345", "Иван", 25);
        Person p3 = new Person("67890", "Петр", 30);
        
        System.out.println(p1.equals(p2)); // true - одинаковый passportId
        System.out.println(p1.equals(p3)); // false - разные passportId
    }
}
