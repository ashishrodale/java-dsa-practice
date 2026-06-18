public class TypeCasting {
    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int number = 100;
        double doubleNumber = number;

        System.out.println("Implicit Type Casting:");
        System.out.println("Int Value: " + number);
        System.out.println("Double Value: " + doubleNumber);

        // Explicit Type Casting (Narrowing)
        double price = 99.99;
        int roundedPrice = (int) price;

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double Value: " + price);
        System.out.println("Int Value: " + roundedPrice);
    }
}
