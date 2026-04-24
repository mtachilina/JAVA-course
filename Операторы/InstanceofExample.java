/**
 * Программа для демонстрации оператора instanceof в Java.
 * 
 * Оператор instanceof проверяет, является ли объект экземпляром указанного
 * класса, подкласса или интерфейса. Возвращает true или false.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class InstanceofExample {
    
    /**
     * Главный метод программы.
     * Демонстрирует работу оператора instanceof с различными типами:
     *   - со строками
     *   - с null объектами
     *   - с массивами
     *   - с пользовательскими классами
     *   - с интерфейсами
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        
        System.out.println(" Оператор instanceof");
        
        // Пример с объектами String
        String text = "Hello";
        System.out.println("text instanceof String: " + (text instanceof String));
        System.out.println("text instanceof Object: " + (text instanceof Object));
        
        // Пример с null объектом
        String nullString = null;
        System.out.println("\nnullString instanceof String: " + (nullString instanceof String));
        
        // Пример с массивами
        int[] numbers = new int[5];
        System.out.println("\nnumbers instanceof int[]: " + (numbers instanceof int[]));
        System.out.println("numbers instanceof Object: " + (numbers instanceof Object));
        
        // Пример с пользовательскими классами
        Animal animal = new Dog();
        System.out.println("\nanimal instanceof Dog: " + (animal instanceof Dog));
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal));
        
        // Пример с интерфейсами
        Cat cat = new Cat();
        System.out.println("\ncat instanceof Pet: " + (cat instanceof Pet));
    }
}

/**
 * Базовый класс Animal.
 */
class Animal { }

/**
 * Подкласс Dog, наследуется от Animal.
 */
class Dog extends Animal { }

/**
 * Интерфейс Pet.
 */
interface Pet { }

/**
 * Класс Cat, реализует интерфейс Pet.
 */
class Cat implements Pet { }
