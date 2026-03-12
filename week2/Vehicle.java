/*create a class called Vehicle.
Add a method called move().
create two subclassee: car and vike.
override the move()method in both subclasses.
*/
class Vehicle{
    void move(){
     System.out.println("Vehicle is moving");

    } 
} 
class Car extends Vehicle{
void move(){
    System.out.println("car is driving");
}
}
class Bike extends Vehicle{
    void move(){
        System.out.println("Bike is riding");

    }
}
class Testvehicle{
    public static void main(String[] args){
        Car c = new Car();
        Bike b =new Bike();
        c.move();
        b.move();
    }

}