import java.time.LocalDate;

public class Pengerjaan {
    private LocalDate tanggal;
    private Tukang tukang;
    private Customer customer;
    private String status;

    public Pengerjaan(LocalDate tanggal, Tukang tukang, Customer customer) {
        this.tanggal = tanggal;
        this.tukang = tukang;
        this.customer = customer;
        this.status = "Pending";
    }

    public void assignTukang(Tukang tukang) {
        this.tukang = tukang;
    }

    public void assignCustomer(Customer customer) {
        this.customer = customer;
    }

    public void updateJobStatus(String status) {
        this.status = status;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public Tukang getTukang() {
        return tukang;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getStatus() {
        return status;
    }
}