class Room{
    double width, height, breadth;
    Room(double width, double height, double breadth){
        this.width = width;
        this.height = height;
        this.breadth = breadth;
    }
    double room_volume(){
        return width * height * breadth;
    }
}

public class assg7A {
    public static void main(String[] args) {
        Room r1 = new Room(20, 30, 30);
        System.out.println("Volume of Room1 = " + r1.room_volume());
        Room r2 = new Room(40, 50, 30);
        System.out.println("Volume of Room2 = " + r2.room_volume());
    }
}
