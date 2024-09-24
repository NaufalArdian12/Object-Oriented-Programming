import java.util.ArrayList;

public class Customer {
    private String idCustomer; //ini id customer biar gaada yang sama
    private String namaCustomer; // ini buat nama customer
    private String nomorCustomer; // ini buat nomornya si customer
    private int ratingCustomer; // ini rating buat si customer
    private ArrayList<Pengerjaan> riwayatPermintaan; // ini buat ngasih tau si customer ini pernah requst apa aja buat bangunan

    //ini buat constructor
    public Customer(String idCustomer, String namaCustomer, String nomorCustomer) {
        this.idCustomer = idCustomer;
        this.namaCustomer = namaCustomer;
        this.nomorCustomer = nomorCustomer;
        this.ratingCustomer = 0;
        this.riwayatPermintaan = new ArrayList<>();
    }

    //ini setter
    public void addRequest(Pengerjaan request) {
        riwayatPermintaan.add(request);
    }

    //ini buat update rattingnya
    public void updateRating(int newRating) {
        this.ratingCustomer = newRating;
    }

    //ini melihatin rating buat si customer
    public void showRating() {
        System.out.println("Rating customer: " + ratingCustomer);
    }

    //ini ngambil id si customer
    public String getIdCustomer() {
        return idCustomer;
    }

    //ini ambil nama si customer
    public String getNamaCustomer() {
        return namaCustomer;
    }

    //ini ambil nomor si customer
    public String getNomorCustomer() {
        return nomorCustomer;
    }

    //ini ambil rating si customer
    public int getRatingCustomer() {
        return ratingCustomer;
    }

    //ini nampilin riwayat pesanan dia
    public void showRequestHistory() {
        System.out.println("Riwayat Permintaan Customer:");
        for (Pengerjaan pengerjaan : riwayatPermintaan) {
            System.out.println("Tanggal: " + pengerjaan.getTanggal() +
                    ", Status: " + pengerjaan.getStatus());
        }
    }
}
