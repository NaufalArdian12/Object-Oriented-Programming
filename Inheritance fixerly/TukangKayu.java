  public class TukangKayu extends Tukang {
    // atrribute tambahan buat tukang kayu
    private String jenisKayu;
    private int jumlahKayu;

    // Default constructor
    public TukangKayu() {
        super(); // memanggil parents class dengan parameterlesss
        this.jenisKayu = "Unknown";
        this.jumlahKayu = 0;
    }

    // Constructor with parameters
    public TukangKayu(String nama, int umur, int jamBekerja, String jenisKayu, int jumlahKayu) {
        super(nama, umur, jamBekerja); // memanggil parent class dengan parameter
        this.jenisKayu = jenisKayu;
        this.jumlahKayu = jumlahKayu;
    }

    // method si kayu itu sendiri
    public void totalKayu() {
        System.out.println(nama + " has worked with " + jumlahKayu + " pieces of " + jenisKayu + " wood.");
    }
  }
