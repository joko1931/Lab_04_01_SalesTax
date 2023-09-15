public class Main {
    public static void main(String[] args)
    {
        double purchasePrice = 20;
        double salesTax = purchasePrice * .05;
        double finalPrice = purchasePrice + salesTax;

        System.out.println("The tax of the purchase is " + salesTax + "$ leading to a final price of " + finalPrice + "$");

    }
}