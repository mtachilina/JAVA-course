/**
 * Программа для демонстрации final-классов и наследования.
 * 
 * final-класс нельзя расширять (нельзя создать подкласс).
 * Обычный класс можно наследовать.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */

/**
 * final-класс. От него нельзя наследоваться.
 * Попытка создать подкласс вызовет ошибку компиляции.
 */
final class FinalClass {
    
    /**
     * Обычный метод final-класса.
     */
    public void someMethod() {
        System.out.println("Метод final-класса");
    }
}

/*
// Следующий код вызовет ошибку компиляции,
// так как нельзя наследовать final-класс
class ChildClass extends FinalClass {
    // Ошибка: cannot inherit from final FinalClass
}
*/

/**
 * Обычный класс. От него можно наследоваться.
 */
class NormalClass {
    
    /**
     * Обычный метод.
     */
    public void normalMethod() { }
}

/**
 * Подкласс обычного класса. Наследование работает.
 */
class ExtendedClass extends NormalClass {
    // Наследование от обычного класса разрешено
}
