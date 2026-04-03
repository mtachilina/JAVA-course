public class InstanceofExample {
    
    public static void main(String[] args) {
        
        System.out.println(" Оператор instanceof");
        
        // Пример 1: с объектами String
        String text = "Hello";
        System.out.println("text instanceof String: " + (text instanceof String));
        System.out.println("text instanceof Object: " + (text instanceof Object));
        
        // Пример 2: с null-объектом
        String nullString = null;
        System.out.println("\nnullString instanceof String: " + (nullString instanceof String));
        
        // Пример 3: с массивами
        int[] numbers = new int[5];
        System.out.println("\nnumbers instanceof int[]: " + (numbers instanceof int[]));
        System.out.println("numbers instanceof Object: " + (numbers instanceof Object));
        
        // Пример 4: с пользовательскими классами
        Animal animal = new Dog();
        System.out.println("\nanimal instanceof Dog: " + (animal instanceof Dog));
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal));
        
        // Пример 5: instanceof с интерфейсами
        Cat cat = new Cat();
        System.out.println("\ncat instanceof Pet: " + (cat instanceof Pet));
    }
}


class Animal { }
class Dog extends Animal { }
interface Pet { }
class Cat implements Pet { }