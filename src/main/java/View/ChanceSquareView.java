package View;

public class ChanceSquareView extends SquareView {
    public void printChanceAmount(int amount){
        if (amount >= 0) {
            System.out.println("Lucky You! You earned $" + amount);
        } else {
            System.out.println("Unlucky You! You loss $" + amount);
        }
    }
}
