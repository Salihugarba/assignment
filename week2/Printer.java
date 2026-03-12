/*
create a class called printer.
overload a method called print() with the the following vresion:
- one method that print a string
- one method that print a int
- one method that print a double 
*/ 
  class printer{
    void print(String text){
        System.out.println(text);
        }
    void print(int number){
        System.out.println(number);
    }
    void main(double value){
        System.out.println(value);
    }
    public static void main(String[] args){
        printer p = new printer();
        p.print("Hello");
        p.print(10);
        p.print(55);
    }
}