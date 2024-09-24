import java.util.ArrayList;

public class Tukang {
    private String idTukang; // id dibuat biar situkang nga ketuker wkwwkwk
    private String namaTukang; // ini aku tambahin nama tukang
    private String nomorTukang; // ini buat nomor situkangnya
    private int ratingTukang; // rating biar tau pengerjaanya memuaskan tidack
    private ArrayList<Pengerjaan> riwayatPengerjaan; // ini buat nampilin riwayat pengerjaannya

    //ini buat constructur intinya ini dipake buat objectnyah
    public Tukang(String idTukang, String namaTukang, String nomorTukang) {
        this.idTukang = idTukang; 
        this.namaTukang = namaTukang;
        this.nomorTukang = nomorTukang;
        this.ratingTukang = 0; // di buat 0 karena semua mulai dari 0
        this.riwayatPengerjaan = new ArrayList<>();
    }

    //ini dibuat nambahin pengerjaanya dan akan masuk di riwayat juga
    public void addJob(Pengerjaan pengerjaan) {
        riwayatPengerjaan.add(pengerjaan);
    }

    //ini buat update rating si tukangnya
    public void updateRating(int newRating) {
        this.ratingTukang = newRating;
    }

    //ini buat nampilin si ratingnya
    public void showRating() {
        System.out.println("Rating tukang: " + ratingTukang);
    }

    //ini buat show pengerjaan yang pernah dia lakukan
    public void showJobHistory() {
        System.out.println("Riwayat Pengerjaan Tukang:");
        for (Pengerjaan pengerjaan : riwayatPengerjaan) {
            System.out.println("Tanggal: " + pengerjaan.getTanggal() +
                    ", Status: " + pengerjaan.getStatus());
        }
    }

    //ini buat ambil id tukangnya
    public String getIdTukang() {
        return idTukang;
    }

    //ini buat ambil nama tukangnya
    public String getNamaTukang() {
        return namaTukang;
    }

    //ini buat ambil nomor tukangnya
    public String getNomorTukang() {
        return nomorTukang;
    }

    //ini buat ambil rating situkangnya
    public int getRatingTukang() {
        return ratingTukang;
    }
}
