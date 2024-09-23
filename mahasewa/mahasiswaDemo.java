package mahasewa;
public class mahasiswaDemo {
    public static void main(String[] args) {
        mahasiswa m1 = new mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        mahasiswa m2 = new mahasiswa();
        m2.nim = "033432";
        m2.nama = "Ayuningtyas Yansy";
        m2.alamat = "Bandung, Jawa Barat";
        m2.kelas = "2A";

        mahasiswa m3 = new mahasiswa();
        m3.nim = "3221";
        m3.nama = "Dzikri Dzibansyah";
        m3.alamat = "Malang, Jawa Timur";
        m3.kelas = "2A";

        m1.displayBioata();
        m2.displayBioata();
        m3.displayBioata();
    }
} 