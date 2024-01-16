public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        super(); // Add this line to invoke the superclass constructor
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}