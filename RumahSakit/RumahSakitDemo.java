import java.time.LocalDate;

public class RumahSakitDemo {
  public static void main(String[] args) {
    Pegawai ani = new Pegawai("1234", "dr. Ani");
    Pegawai bagus = new Pegawai("4567", "dr. Bagus");

    Pegawai desi = new Pegawai("1234", "dr. Desi");
    Pegawai eka = new Pegawai("4567", "dr. Eka");

    Pasien pasien1 = new Pasien("343298", "Puspa Widya");
    pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
    pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);

    System.out.println(pasien1.getInfo());

    Pasien pasien2 = new Pasien("997744", "Yenny Anggreni");
    System.out.println(pasien2.getInfo());
  }
}
