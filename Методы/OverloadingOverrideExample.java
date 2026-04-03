class Animal {
    
    // Перегруженные методы в одном классе
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

public class OverloadingOverrideExample {
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