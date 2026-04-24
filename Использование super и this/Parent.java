/**
 * Программа для демонстрации использования ключевого слова super.
 * 
 * super используется для:
 * 1. вызова конструктора суперкласса
 * 2. доступа к полю суперкласса
 * 3. доступа к методу суперкласса
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */

/**
 * Суперкласс (родительский класс).
 */
class Parent {
    protected int number = 10;
    
    /**
     * Конструктор по умолчанию.
     */
    public Parent() {
        System.out.println("Конструктор Parent");
    }
    
    /**
     * Конструктор с параметром.
     * 
     * @param value передаваемое значение
     */
    public Parent(int value) {
        System.out.println("Конструктор Parent с параметром: " + value);
    }
    
    /**
     * Метод суперкласса.
     */
    public void show() {
        System.out.println("Метод Parent");
    }
}

/**
 * Подкласс (дочерний класс).
 */
class Child extends Parent {
    private int number = 20;  // поле с таким же именем, как в суперклассе
    
    /**
     * Конструктор без параметров.
     * Вызывает конструктор суперкласса по умолчанию через super().
     */
    public Child() {
        super();  // вызов конструктора суперкласса
        System.out.println("Конструктор Child");
    }
    
    /**
     * Конструктор с параметром.
     * Вызывает параметризованный конструктор суперкласса через super(value).
     * 
     * @param value передаваемое значение
     */
    public Child(int value) {
        super(value);  // вызов конструктора суперкласса с параметром
    }
    
    /**
     * Демонстрация доступа к полю суперкласса.
     * super.number обращается к полю родителя.
     * this.number обращается к полю текущего класса.
     */
    public void display() {
        System.out.println("super.number = " + super.number);  // доступ к полю суперкласса
        System.out.println("this.number = " + this.number);    // доступ к своему полю
    }
    
    /**
     * Переопределённый метод.
     * Вызывает метод суперкласса через super.show().
     */
    @Override
    public void show() {
        super.show();  // доступ к методу суперкласса
        System.out.println("Метод Child");
    }
}
