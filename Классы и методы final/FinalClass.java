final class FinalClass {
    public void someMethod() {
        System.out.println("Метод final-класса");
    }
}

/*
class ChildClass extends FinalClass {
    // попытка наследования вызовет ошибку
}
*/

class NormalClass {
    public void normalMethod() { }
}

class ExtendedClass extends NormalClass {
    // это работает
}