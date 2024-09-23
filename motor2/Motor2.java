
/**
 * Motor2
 */
public class Motor2 {
    private String plateNumber;
    private Boolean isMesinOn;
    private int speed;

    // Constructor
    public Motor2() {
        isMesinOn = false;
    }

    public void displayStatus() {
        System.out.println("Plat Nomor: " + getPlatNumber());
        
        if (isMesinOn) {
            System.out.println("Mesin ON");
        } else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan: " + getKecepatan());
        System.out.println("=========================");
    }

    public String getPlatNumber() {
        return plateNumber;
    }

    public void setPlatNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    // public boolean isIsMesinOn() {
    //     return isMesinOn;
    // }

    public void setIsMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    public int getKecepatan() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (!isMesinOn && speed > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }else if (speed > 100) {
            System.out.println("ojo banter banter le");
        }else if (speed < 0) {
            System.out.println("motornya harus jalan");
        } else {
            this.speed = speed;
        }
    }
}