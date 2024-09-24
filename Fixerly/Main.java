public class Main {
    public static void main(String[] args) {
        // Membuat objek Customer dan Tukang dengan nama walaupun ga ngefek
        Customer customer1 = new Customer("C001", "Epunk", "081234567890");
        Tukang tukang1 = new Tukang("T001", "Najril", "089876543210");

        // ini Membuat objek Pengerjaan tanggal dan bisa diubah 
        Pengerjaan pengerjaan1 = new Pengerjaan("12 - 12 - 2024", tukang1, customer1);

        // Menambahkan pengerjaan ke riwayat customer dan tukang
        customer1.addRequest(pengerjaan1);
        tukang1.addJob(pengerjaan1);

        // ini Menampilkan detail pengerjaan
        pengerjaan1.showDetails();

        // ini buat update status pengerjaan dan menambahkan rating
        pengerjaan1.updateJobStatus("In Progress");
        pengerjaan1.showStatus();

        //update lagi biar keren
        pengerjaan1.updateJobStatus("Completed");
        customer1.updateRating(5);//ini rating si customer
        tukang1.updateRating(4);//ini rating si tukang

        //ini info buat ngasih tau kalau udah selesai dan ngasih rating
        pengerjaan1.showStatus();
        customer1.showRating();
        tukang1.showRating();

        //nampilin riwayat pengerjaan si Tukang
        tukang1.showJobHistory();
        //nampilin riwayat pesanan si customer
        customer1.showRequestHistory();

        System.out.println("");
        System.out.println("================================");
        System.out.println("");

        // Membuat objek Customer dan Tukang dengan nama walaupun ga ngefek
        Customer customer2 = new Customer("C002", "Nopal Sutejo", "081234567890");
        Tukang tukang2 = new Tukang("T002", "sapijal", "089876543210");

        // ini Membuat objek Pengerjaan tanggal dan bisa diubah 
        Pengerjaan pengerjaan2 = new Pengerjaan("11 - 11 - 2024", tukang2, customer2);

        // Menambahkan pengerjaan ke riwayat customer dan tukang
        customer2.addRequest(pengerjaan2);
        tukang2.addJob(pengerjaan2);

        // ini Menampilkan detail pengerjaan
        pengerjaan2.showDetails();

        // ini buat update status pengerjaan dan menambahkan rating
        pengerjaan2.updateJobStatus("In Progress");
        pengerjaan2.showStatus();

        //update lagi biar keren
        pengerjaan2.updateJobStatus("Completed");
        customer2.updateRating(2);//ini rating si customer
        tukang2.updateRating(3);//ini rating si tukang

        //ini info buat ngasih tau kalau udah selesai dan ngasih rating
        pengerjaan2.showStatus();
        customer2.showRating();
        tukang2.showRating();

        //nampilin riwayat pengerjaan si Tukang
        tukang2.showJobHistory();
        //nampilin riwayat pesanan si customer
        customer2.showRequestHistory();

        System.out.println("");
        System.out.println("================================");
        System.out.println("");
    }
}
