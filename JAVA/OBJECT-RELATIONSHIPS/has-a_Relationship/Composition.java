class Room {
    String name;
    Room(String name) {
        this. name = name;
    }
    void show() {
        System.out.println("Room: " + name);
    }
}

class House {
    //Composition: Rooms are created and owned by House
    private Room livingRoom;
    private Room kitchen;

    House() {
        //Parts created inside the whole
        this.livingRoom = new Room("Living Room");
        this.kitchen = new Room("Kitchen");
    }

    void showRooms() {
        livingRoom.show();
        kitchen.show();
    }
}
public class Composition {    
    public static void main(String[] args) {
        House house = new House();
        house.showRooms();
    }
}
