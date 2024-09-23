
public class MotorDemo {
    public static void main(String[] args) {
        Motor2 motor1 = new Motor2();
        motor1.displayStatus();

        motor1.setPlatNumber("B 09892 HJ");
        motor1.setIsMesinOn(false);
        motor1.setSpeed(50);
        motor1.displayStatus();

        Motor2 motor2 = new Motor2();
        motor2.setPlatNumber("N 5555 KO");
        motor2.setIsMesinOn(true);
        motor2.setSpeed(910);
        motor2.displayStatus();

        Motor2 motor3 = new Motor2();
        motor3.setPlatNumber("D 9999 AW");
        motor3.setIsMesinOn(true);
        motor3.setSpeed(-60);
        motor3.displayStatus();

        Motor2 motor4 = new Motor2();
        motor4.setPlatNumber("D 9999 AW");
        motor4.setIsMesinOn(true);
        motor4.setSpeed(60);
        motor4.displayStatus();
    }
}