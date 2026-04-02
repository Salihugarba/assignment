interface Transport {
    void move();
}

class Bus implements Transport {
    public void move() {
        System.out.println("Bus is moving");
    }
}

class Taxi implements Transport {
    public void move() {
        System.out.println("Taxi is moving");
    }
}

public class Main {
    public static void main(String[] args) {
        Transport bus = new Bus();
        Transport taxi = new Taxi();

        bus.move();
        taxi.move();
    }
}