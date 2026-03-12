/*Demonstrate dynamic method dispatch using the following.
Vehicle v = new car().
The a call the move()method.
*/
class Dynamic{
    void move(){
        System.out.println("Vehicle is driving");
    }
}
class car extends Vehicle{
    @Override
    void move(){
    System.out.println("Car is driving");
    }
}
class TestDispatc{
    public static void main(String[] args){
        Vehicle v = new car();
        v.move();
    }
}