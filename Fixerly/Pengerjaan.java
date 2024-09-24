public class Pengerjaan {
    private String tanggal; // Mengganti LocalDate dengan String
    private Tukang tukang;
    private Customer customer;
    private String status;

    //ini constructor berguna ketika mau buat object baru
    public Pengerjaan(String tanggal, Tukang tukang, Customer customer) {
        this.tanggal = tanggal;
        this.tukang = tukang;
        this.customer = customer;
        this.status = "Pending";
    }

    // setter ini dipake untuk mengubah tanggal
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    //ini buat update job status entah itu pending, complete, ataupun gagal
    public void updateJobStatus(String status) {
        this.status = status;
    }

    //ini buat show details kapan dikerjain siapa si customer dan siapa si tukangnya
    public void showDetails() {
        if (tanggal != null) {
            System.out.println("Pengerjaan dibuat: Tanggal - " + tanggal +
                    "\nTukang - " + tukang.getIdTukang() +
                    "\nCustomer - " + customer.getIdCustomer());
        } else {
            System.out.println("Tanggal pengerjaan belum diatur.");
        }
    }

    //ini buat ngasih tau status pengerjaanya
    public void showStatus() {
        System.out.println("Status pengerjaan: " + status);
    }

    //ini buat getter si tanggalnya
    public String getTanggal() {
        return tanggal;
    }

    //ini buat ngambil si tukangnya
    public Tukang getTukang() {
        return tukang;
    }

    //ini buat ngambil si customernya
    public Customer getCustomer() {
        return customer;
    }

    //ini buat ambil statusnya
    public String getStatus() {
        return status;
    }
}
