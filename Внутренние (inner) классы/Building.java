public class Building {
    
    public class Room {
        private int roomNumber = 101;
        public double area = 25.5;
        protected String type = "Офис";
        int floor = 1;
        
        private void showSecret() {
            System.out.println("Секрет комнаты");
        }
        
        public void showInfo() {
            System.out.println("Комната " + roomNumber);
        }
    }
    
    public void inspectRoom() {
        Room room = new Room();
        
        System.out.println("roomNumber = " + room.roomNumber);     
        System.out.println("area = " + room.area);               
        System.out.println("type = " + room.type);               
        System.out.println("floor = " + room.floor);              
        
        room.showSecret(); 
        room.showInfo();  
    }
    
    public static void main(String[] args) {
        Building building = new Building();
        building.inspectRoom();
    }
}