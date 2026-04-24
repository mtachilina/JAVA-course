/**
 * Программа для демонстрации доступа внешнего класса к полям и методам внутреннего класса.
 * 
 * Внешний класс имеет доступ ко ВСЕМ (включая private) полям и методам внутреннего класса.
 * Спецификаторы доступа внутреннего класса не ограничивают внешний класс.
 * 
 * @author Тачилина Мария
 * @version 1.0
 * @since 2026-04-24
 */
public class Building {
    
    /**
     * Внутренний класс Room.
     * Содержит поля с разными спецификаторами доступа.
     */
    public class Room {
        private int roomNumber = 101;      // доступен только внутри Room
        public double area = 25.5;         // доступен везде
        protected String type = "Офис";    // доступен в пакете и подклассах
        int floor = 1;                     // доступен в пакете (default)
        
        /**
         * Приватный метод внутреннего класса.
         */
        private void showSecret() {
            System.out.println("Секрет комнаты");
        }
        
        /**
         * Публичный метод внутреннего класса.
         */
        public void showInfo() {
            System.out.println("Комната " + roomNumber);
        }
    }
    
    /**
     * Метод внешнего класса.
     * Демонстрирует доступ ко всем членам внутреннего класса,
     * включая приватные.
     */
    public void inspectRoom() {
        Room room = new Room();
        
        // Доступ к private полю - разрешён
        System.out.println("roomNumber = " + room.roomNumber);     
        // Доступ к public полю
        System.out.println("area = " + room.area);               
        // Доступ к protected полю
        System.out.println("type = " + room.type);               
        // Доступ к default полю
        System.out.println("floor = " + room.floor);              
        
        // Доступ к private методу - разрешён
        room.showSecret(); 
        // Доступ к public методу
        room.showInfo();  
    }
    
    /**
     * Главный метод программы.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Building building = new Building();
        building.inspectRoom();
    }
}
