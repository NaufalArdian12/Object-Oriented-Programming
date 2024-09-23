public class CarDemo {
    public static void main(String[] args) {
        
        //first object
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.color = "Silver";
        car1.fuelLevel = 4;
        car1.currentSpeed = 40;

        car1.startEngine();
        car1.displayInfo();
        car1.accelerate();
        car1.playMusic("joji");
        car1.refuel(21);
        car1.turnOnHeadLight();

        System.out.println("");

        //second object
        Car car2 = new Car();
        car2.brand = "BMW";
        car2.model = "E30";
        car2.color = "White";
        car2.fuelLevel = 9;
        car2.currentSpeed = 100;

        car2.startEngine();
        car2.displayInfo();
        car2.accelerate();
        car2.playMusic("Sza");
        car2.refuel(32);
        car2.turnOnHeadLight();
    }
}
