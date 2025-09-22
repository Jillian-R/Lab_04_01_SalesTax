//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int itemPrice = 100;
        double salesTax = .05 * itemPrice;
        double totalPrice = itemPrice + salesTax;
        System.out.println("The price is" + " " + itemPrice);
        System.out.println("The sales tax is " + salesTax);
        System.out.println("The total price including sales tax is " + totalPrice);
        }
    }