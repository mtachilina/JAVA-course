public interface Vehicle {
    
    void start();
    
    class Helper {
        public static void checkEngine() {
            System.out.println("Проверка двигателя");
        }
        
        public void showInfo() {
            System.out.println("Вспомогательный класс Vehicle");
        }
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Машина заведена");
    }
}

class Main {
    public static void main(String[] args) {
        // Способ 1: вызов статического метода
        Vehicle.Helper.checkEngine();
        
        // Способ 2: создание экземпляра вложенного класса
        Vehicle.Helper helper = new Vehicle.Helper();
        helper.showInfo();
        
        // Способ 3: через реализацию интерфейса
        Car car = new Car();
        car.start();
    }
}