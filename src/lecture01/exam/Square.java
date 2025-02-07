package lecture01.exam;


public class Square implements Comparable<Square> {
    int length; // side length of the square

    // Constructor (setting the length)
    public Square(int length) {
        this.length = length;
    }

    // Getter Method for length
    public int getLength() {
        return length;
    }

    // Setter Method for length
    public void setLength(int length) {
        this.length = length;
    }

    // Calculating the circumference of the square (Formula: 4 times the length)
    public int circumference() {
        return 4 * length;
    }

    // Calculating the area size of the square (Formula: length squared)
    public int area() {
        return length * length;
    }

    @Override
    public int compareTo(Square o) {        // 1 point
        return this.length - o.length;        // 1 point
    }


}

