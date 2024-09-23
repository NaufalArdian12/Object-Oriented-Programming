public class Cooperation {
    private String cardNumber;
    private String name;
    private int maxBorrow;
    private int borrow;

    public Cooperation(String cardNumber, String name, int maxBorrow, int borrow){
        this.cardNumber = cardNumber;
        this.name = name;
        this.maxBorrow = maxBorrow;
        this.borrow = borrow;
    }

    public void displayInfo(){
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Name: " + name);
        System.out.println("Borrow: " + borrow);
        System.out.println("Max Borrow: " + maxBorrow);
        System.out.println("================================");
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getMaxBorrow(){
        return maxBorrow;
    }

    public void setMaxBorrow(int maxBorrow){
        this.maxBorrow = maxBorrow;
        System.out.println("Your max borrow limit is: " + maxBorrow);
    }

    public int getBorrow(){
        return borrow;
    }

    public void setBorrow(int borrow){
        if (borrow > maxBorrow) {
            System.out.println("Sorry, you can't borrow more than the limit.");
        } else {
            this.borrow = borrow;
            System.out.println("You borrowed: " + borrow);
        }
    }

    public void payBorrow(int pay){
        int minimumPayment = (int) (borrow * 0.10); // Calculate 10% of current borrow
        if (pay < minimumPayment) {
            System.out.println("Sorry, the installment must be at least 10% of the loan amount.");
        } else if (pay > borrow) {
            System.out.println("You can't pay more than your current borrow amount.");
        } else {
            this.borrow -= pay;
            System.out.println("You paid: " + pay);
        }
    }
}