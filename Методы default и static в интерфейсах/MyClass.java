interface A {
    default void print() {
        System.out.println("Интерфейс A");
    }
}

interface B {
    default void print() {
        System.out.println("Интерфейс B");
    }
}

// Класс реализует оба интерфейса с конфликтующими методами
public class MyClass implements A, B {
    
    // Обязательно переопределить конфликтующий метод
    @Override
    public void print() {
        System.out.println("Мой собственный метод");
        
        // Можно вызвать метод конкретного интерфейса
        A.super.print();   // вызов метода из A
        B.super.print();   // вызов метода из B
    }
    
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.print();
    }
}