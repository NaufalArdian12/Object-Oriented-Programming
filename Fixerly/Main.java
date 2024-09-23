import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Customer
        Customer customer1 = new Customer("C001", "081234567890");
        System.out.println("Customer dibuat: " + customer1.getIdCustomer() + ", Nomor: " + customer1.getNomorCustomer());

        // Membuat objek Tukang
        Tukang tukang1 = new Tukang("T001", "089876543210");
        System.out.println("Tukang dibuat: " + tukang1.getIdTukang() + ", Nomor: " + tukang1.getNomorTukang());

        // Membuat objek Pengerjaan
        Pengerjaan pengerjaan1 = new Pengerjaan(LocalDate.now(), tukang1, customer1);
        System.out.println("Pengerjaan dibuat: Tanggal - " + pengerjaan1.getTanggal() +
                "\nTukang - " + pengerjaan1.getTukang().getIdTukang() +
                ", Customer - " + pengerjaan1.getCustomer().getIdCustomer());

        // Menambahkan pengerjaan ke riwayat customer dan tukang
        customer1.addRequest(pengerjaan1);
        tukang1.addJob(pengerjaan1);

        // Mengupdate status pengerjaan
        pengerjaan1.updateJobStatus("In Progress");
        System.out.println("Status pengerjaan diupdate menjadi: " + pengerjaan1.getStatus());

        // Mengupdate rating customer dan tukang setelah pengerjaan selesai
        pengerjaan1.updateJobStatus("Completed");
        customer1.updateRating(5);
        tukang1.updateRating(4);
        System.out.println("Pengerjaan selesai dengan status: " + pengerjaan1.getStatus());
        System.out.println("Rating customer: " + customer1.getRatingCustomer());
        System.out.println("Rating tukang: " + tukang1.getRatingTukang());

        // Menampilkan riwayat pengerjaan untuk Tukang
        System.out.println("Riwayat Pengerjaan Tukang:");
        for (Pengerjaan pengerjaan : tukang1.getRiwayatPengerjaan()) {
            System.out.println("Tanggal: " + pengerjaan.getTanggal() +
                    ", Status: " + pengerjaan.getStatus());
        }
    }
}
