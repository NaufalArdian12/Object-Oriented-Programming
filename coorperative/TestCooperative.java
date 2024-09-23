public class TestCooperative {

    public static void main(String[] args) {
        Cooperation cooperation1 = new Cooperation("212121", "npl", 0, 0);
        cooperation1.displayInfo();
        cooperation1.setCardNumber("2121212");
        cooperation1.setName("npl");
        cooperation1.setMaxBorrow(3000000);
        cooperation1.setBorrow(3100000);
        cooperation1.displayInfo();

        Cooperation cooperation2= new Cooperation("212121", "npl", 0, 0);
        cooperation2.setCardNumber("21212123");
        cooperation2.setName("nzl");
        cooperation2.setMaxBorrow(3000000);
        cooperation2.setBorrow(300000);
        cooperation2.payBorrow(2000);
        cooperation2.displayInfo();
    }
}
