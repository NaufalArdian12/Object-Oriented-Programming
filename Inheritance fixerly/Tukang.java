public class Tukang {
  // Attributes
  protected String nama;
  protected int umur;
  protected int jamBekerja;

  // Cunstructor defaultnya tapi pake paramaterless
  public Tukang() {
      this.nama = "Unknown";
      this.umur = 0;
      this.jamBekerja = 0;
  }

  // Constructor pake parameter
  public Tukang(String nama, int umur, int jamBekerja) {
      this.nama = nama;
      this.umur = umur;
      this.jamBekerja = jamBekerja;
  }

  // ini untuk melihatkan rating si tukang
  public void showRating() {
      System.out.println(nama + " has a rating of 4.5 stars");
  }
}
