public class Task2 {
    public static void main(String[] args) {
        double price = 250;
        double discount = 0.15 * price;
        double finalPrice = price - discount;

        System.out.printf("Final price after discount: $%.2f\n", finalPrice);
    }
}