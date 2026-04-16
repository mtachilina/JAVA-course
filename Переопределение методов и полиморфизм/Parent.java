class Parent {
    public void printMessage() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    public void printMassage() { 
        System.out.println("Child");
    }
}