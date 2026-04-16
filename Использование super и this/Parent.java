class Parent {
    protected int number = 10;
    
    public Parent() {
        System.out.println("Конструктор Parent");
    }
    
    public Parent(int value) {
        System.out.println("Конструктор Parent с параметром: " + value);
    }
    
    public void show() {
        System.out.println("Метод Parent");
    }
}

class Child extends Parent {
    private int number = 20;
    
    public Child() {
        super();  // 1. вызов конструктора суперкласса
        System.out.println("Конструктор Child");
    }
    
    public Child(int value) {
        super(value);  // 1. вызов конструктора суперкласса с параметром
    }
    
    public void display() {
        System.out.println("super.number = " + super.number);  // 2. доступ к полю суперкласса
        System.out.println("this.number = " + this.number);    
    }
    
    @Override
    public void show() {
        super.show();  // 3. доступ к методу суперкласса
        System.out.println("Метод Child");
    }
}