/**
 * Программа для демонстрации обнаружения ошибки с помощью аннотации @Override.
 * 
 * Аннотация @Override заставляет компилятор проверить,
 * что метод действительно переопределяет метод суперкласса.
 * 
 * Если допущена опечатка в имени метода (printMassage вместо printMessage),
 * компилятор выдаст ошибку, что нет метода для переопределения.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */

/**
 * Суперкласс Parent.
 */
class Parent {
    
    /**
     * Метод для вывода сообщения.
     */
    public void printMessage() {
        System.out.println("Parent");
    }
}

/**
 * Подкласс Child.
 * Пытается переопределить метод printMessage, но допущена опечатка.
 * 
 * Следующий код вызовет ошибку компиляции:
 * "method does not override or implement a method from a supertype"
 * 
 * Правильно должно быть: printMessage (с буквой e после g)
 */
class Child extends Parent {
    
    // Ошибка! Нет метода printMassage в суперклассе Parent
    @Override
    public void printMassage() { 
        System.out.println("Child");
    }
}

/**
 * Исправленный вариант:
 * 
 * class Child extends Parent {
 *     @Override
 *     public void printMessage() { 
 *         System.out.println("Child");
 *     }
 * }
 */
