public class Main
{
    public static void main(String[] args)
    {
        double purchasePrice = 71.50;
        double salesTax = 0.05;

        double productSalesTax = purchasePrice*salesTax;

        System.out.println("The price of your product is $" + purchasePrice);
        System.out.println("The sales tax is $" + productSalesTax);

    }
}