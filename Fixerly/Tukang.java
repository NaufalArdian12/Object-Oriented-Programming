import java.util.ArrayList;

public class Tukang {
    private String idTukang;
    private String nomorTukang;
    private int ratingTukang;
    private ArrayList<Pengerjaan> riwayatPengerjaan;

    public Tukang(String idTukang, String nomorTukang) {
        this.idTukang = idTukang;
        this.nomorTukang = nomorTukang;
        this.ratingTukang = 0;
        this.riwayatPengerjaan = new ArrayList<>();
    }

    public void addJob(Pengerjaan pengerjaan) {
        riwayatPengerjaan.add(pengerjaan);
    }

    public void updateRating(int newRating) {
        this.ratingTukang = newRating;
    }

    public String getIdTukang() {
        return idTukang;
    }

    public String getNomorTukang() {
        return nomorTukang;
    }

    public int getRatingTukang() {
        return ratingTukang;
    }

    public ArrayList<Pengerjaan> getRiwayatPengerjaan() {
        return riwayatPengerjaan;
    }

    public void setNomorTukang(String nomor) {
        this.nomorTukang = nomor;
    }

    public void setRatingTukang(int rating) {
        this.ratingTukang = rating;
    }
}