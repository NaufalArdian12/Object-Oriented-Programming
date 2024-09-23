/**
 * Square
 */
public class Square {

    public int longg;
    public int wide;

    public int getArea() {
        return longg * wide;
    }

    public int getCircumference() {
            return 4 * longg;
    }

    public void displayInfo() {
        System.out.println("square area is          : " + getArea());
        System.out.println("square perimeter is     : " + getCircumference());
    }

}