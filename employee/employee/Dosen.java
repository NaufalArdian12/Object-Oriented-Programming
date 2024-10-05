package employee;
import employee.Pegawai;

public class Dosen extends Pegawai {
    public String nidn;

  public Dosen(String nip, String nama, double gaji, String nidn) {
    // System.out.println(gaji);
    System.out.println("Objek dari Class Dosen Dibuat");
  }

  public String getInfo(){
    // String info = this.getInfo();
    // String info = "";
    // info += "NIP        :" + super.nip + "\n";
    // info += "Nama       :" + super.nama + "\n";
    // info += "Gaji       :" + super.gaji + "\n";
    return "NIDN       : " + this.nidn + "\n";
  }

  public String getAllInfo(){
    String info = super.getInfo();
    info += this.getInfo();

    return info;
  }
}
