/**
 * Car
 */
public class Car {

    public String brand;
    public String model;
    public String color;
    public int fuelLevel;
    public int currentSpeed;
    
    public void startEngine() {
        System.out.println("Engine Start");
    }

    public void accelerate() {
        currentSpeed += 10;
        System.out.println("Accelerating. Current Speed: " + currentSpeed + " Km/h");
    }

    public void turnOnHeadLight() {
        System.out.println("Headlights are on");
    }

    public void playMusic(String track) { 
        System.out.println("Now Playing: " + track);
    }

    public void refuel(int liters) {
        fuelLevel += liters;
        System.out.println("Refueled " + liters + " Liters. Current fuel level " + fuelLevel + " Liters");
    }

    public void displayInfo() {
        System.out.println("Brand           : " + brand);
        System.out.println("Model           : " + model);
        System.out.println("Color           : " + color);
        System.out.println("Fuel level      : " + fuelLevel + " liters");
        System.out.println("Current Speed   : " + currentSpeed + " Km/h");
    }
}