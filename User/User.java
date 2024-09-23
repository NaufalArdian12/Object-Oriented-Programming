/**
 * User
 */
public class User {
    public String username;
    public String nama;
    public String email;
    public String alamat;
    public String pekerjaan;

    public User(String username, String nama, String email){
        this.username = username;
        this.nama = nama;
        this.email = email;
    }

    public void cetakInfo(){
        System.out.println("Username: " + username);
        System.out.println("nama: " + nama);
        System.out.println("email: " + email);
        System.out.println("alamat: " + alamat);
        System.out.println("pekerjaan: " + pekerjaan);
        System.out.println("============================");

    }
}