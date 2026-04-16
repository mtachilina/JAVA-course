class Animal {
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
    
    public Animal getAnimal() {
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Собака лает: Гав-гав");
    }
    
    // ошибка
    // public String getAnimal() {
    //     return "собака";
    // }
}