import java.util.ArrayList;

public class Customer {
    private String idCustomer;
    private String nomorCustomer;
    private int ratingCustomer;
    private ArrayList<Pengerjaan> riwayatPermintaan;

    public Customer(String idCustomer, String nomorCustomer) {
        this.idCustomer = idCustomer;
        this.nomorCustomer = nomorCustomer;
        this.ratingCustomer = 0;
        this.riwayatPermintaan = new ArrayList<>();
    }

    public void addRequest(Pengerjaan request) {
        riwayatPermintaan.add(request);
    }

    public void updateRating(int newRating) {
        this.ratingCustomer = newRating;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public String getNomorCustomer() {
        return nomorCustomer;
    }

    public int getRatingCustomer() {
        return ratingCustomer;
    }

    public ArrayList<Pengerjaan> getRiwayatPermintaan() {
        return riwayatPermintaan;
    }

    public void setNomorCustomer(String nomor) {
        this.nomorCustomer = nomor;
    }

    public void setRatingCustomer(int rating) {
        this.ratingCustomer = rating;
    }
}
