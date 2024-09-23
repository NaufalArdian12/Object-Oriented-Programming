import java.util.ArrayList;
import java.time.LocalDate;
/**
 * Pasien
 */
public class Pasien {

  private String noRekamMedis;
  private String nama;
  private ArrayList<Konsultasi> riwayatKonsultasi;

  public Pasien(String noRekamMedis, String nama) {
    this.noRekamMedis = noRekamMedis;
    this.nama = nama;
    this.riwayatKonsultasi = new ArrayList<Konsultasi>();
  }

  public void tambahKonsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat) {
    Konsultasi konsultasi = new Konsultasi();
    konsultasi.setTanggal(tanggal);
    konsultasi.setDokter(dokter);
    konsultasi.setPerawat(perawat);
    riwayatKonsultasi.add(konsultasi);
  }

  public String getNorekemaMedis() {
    return noRekamMedis;
  }

  public void setNoRekamMedis (String noRekamMedis) {
    this.noRekamMedis = noRekamMedis;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getInfo() {
    String info = "";
    info += "No Rekam Medis     : " + this.noRekamMedis + "\n";
    info += "Nama     : " + this.nama + "\n";
    
    if (!riwayatKonsultasi.isEmpty()) {
      info += "Riwayat Konsultasi : \n";

      for (Konsultasi konsultasi : riwayatKonsultasi) {
        info += konsultasi.getInfo();
      }
    } else {
      info += "Belum ada riwayat konsultasi";
    }
    
    info += "\n";

    return info;
  }
}