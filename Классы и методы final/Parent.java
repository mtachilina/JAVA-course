class Parent {
    public void normalMethod() {
        System.out.println("Обычный метод");
    }
    
    public final void finalMethod() {
        System.out.println("Final метод — нельзя переопределить");
    }
}

class Child extends Parent {
    @Override
    public void normalMethod() {
        System.out.println("Переопределенный обычный метод");
    }
    
    // нельзя переопределить final-метод
    /*
    @Override
    public void finalMethod() {
        System.out.println("Попытка переопределить final метод");
    }
    */
}
