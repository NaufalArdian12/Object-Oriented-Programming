/**
 * Motor
 */
public class Motor {
    public String platNomor;
    public boolean isMesinOn;
    public int kecepatan;

    public Motor(String platNomor, boolean isMesinOn, int kecepatan) {
        this.platNomor = platNomor;
        this.isMesinOn = isMesinOn;
        this.kecepatan = kecepatan;
    }

    public void displayStatus(){
        System.out.println("Plat Nomor: " + platNomor);
        
        if (isMesinOn) {
            System.out.println("Mesin ON");
        } else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("=========================");
    }
}