/**
 * Программа для демонстрации перегрузки (overloading) и переопределения (override) методов.
 * 
 * Перегрузка (overloading) - несколько методов с одинаковым именем, но разными параметрами.
 * Переопределение (override) - метод подкласса заменяет метод суперкласса.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
class Animal {
    
    /**
     * Перегруженные методы makeSound.
     * Отличаются количеством и типами параметров.
     */
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
    
    public void makeSound(String volume) {
        System.out.println("Животное издает звук громкостью: " + volume);
    }
    
    public void makeSound(int count) {
        System.out.println("Животное издает звук " + count + " раза");
    }
    
    public void move() {
        System.out.println("Животное двигается");
    }
    
    public void eat() {
        System.out.println("Животное ест");
    }
}

/**
 * Подкласс Dog.
 * Переопределяет методы move и eat.
 */
class Dog extends Animal {
    
    @Override
    public void move() {
        System.out.println("Собака бегает");
    }
    
    @Override
    public void eat() {
        System.out.println("Собака ест кость");
    }
    
    public void bark() {
        System.out.println("Собака лает");
    }
}

/**
 * Подкласс Cat.
 * Переопределяет методы move и eat.
 */
class Cat extends Animal {
    
    @Override
    public void move() {
        System.out.println("Кошка крадется");
    }
    
    @Override
    public void eat() {
        System.out.println("Кошка ест рыбу");
    }
    
    public void meow() {
        System.out.println("Кошка мяукает");
    }
}

/**
 * Демонстрационный класс.
 * Показывает разницу между перегрузкой и переопределением.
 */
public class OverloadingOverrideExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует:
     * - перегрузку методов в классе Animal
     * - переопределение методов в классах Dog и Cat
     * - полиморфизм (переменная суперкласса ссылается на объект подкласса)
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        System.out.println("overloading");
        Animal animal = new Animal();
        animal.makeSound();
        animal.makeSound("громко");
        animal.makeSound(3);
        
        System.out.println("\n override");
        Animal animalRef = new Animal();
        animalRef.move();
        animalRef.eat();
        
        Dog dog = new Dog();
        dog.move();
        dog.eat();
        dog.bark();
        
        Cat cat = new Cat();
        cat.move();
        cat.eat();
        cat.meow();
        
        System.out.println("\n полиморфизм");
        Animal polyDog = new Dog();
        Animal polyCat = new Cat();
        
        polyDog.move();  
        polyCat.move(); 
    }
}
