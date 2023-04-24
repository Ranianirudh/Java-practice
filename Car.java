public class Car{
    String brand;
    String color;
    float price;
    public void start(){
        System.out.println("car :" + brand + ", color: " + color + " is starting");
    }
    public void move(){
       System.out.println("car:" + brand + ", color: " + color + " is moving");
    }
    public void stop(){
        System.out.println("car:" + brand + ", color: " + color + " is stopping");
    }
    public void honk(){
        System.out.println("car:" + brand + ", color: " + color + " is honking");
    }
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.brand="Honda";
        myCar.color="white";
        myCar.price=38000f;
        myCar.start();
        myCar.move();
        myCar.honk();
        myCar.stop();


    }

}
