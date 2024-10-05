public class TukangBatu extends Tukang {
  // attribute tambahan buat si tukang batu
  private String jenisBatu;
  private int jumlahBatu;

  // Default constructor
  public TukangBatu() {
      super(); // manggil class dengan parameterless
      this.jenisBatu = "Unknown";
      this.jumlahBatu = 0;
  }

  // Constructor dengan parameters
  public TukangBatu(String nama, int umur, int jamBekerja, String jenisBatu, int jumlahBatu) {
      super(nama, umur, jamBekerja); // memangil parent class dengan parameter
      this.jenisBatu = jenisBatu;
      this.jumlahBatu = jumlahBatu;
  }

  // method si batu itu sendiri
  public void totalBatu() {
      System.out.println(nama + " has worked with " + jumlahBatu + " pieces of " + jenisBatu + " stone.");
  }
}
