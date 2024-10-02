package try;
public class Main {
  public static void main(String[] args) {
    Dosen dosen1 = new Dosen();

    dosen1.nama = "Nopal Sutejo";
    dosen1.nip = "3412760148";
    dosen1.gaji = 300000;
    dosen1.nidn = "19889942439";

    System.out.println(dosen1.getInfo());
  }
}
