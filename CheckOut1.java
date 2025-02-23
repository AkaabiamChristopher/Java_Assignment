import java.util.ArrayList;
import java.util.Scanner;

public class CheckOut1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> itemsBought = new ArrayList<>();
        ArrayList<Double> itemPrice = new ArrayList<>();
        ArrayList<Integer> itemsQuantity = new ArrayList<>();

        System.out.println("What is your name (coustomer)?");
        String name = input.nextLine();

        while (true) {
            System.out.print("What did you buy? ");
            String itemPurchased = input.nextLine();
            itemsBought.add(itemPurchased);

            System.out.print("How many pieces? ");
            int itemsNumber = input.nextInt();
            itemsQuantity.add(itemsNumber);

            System.out.print("How much per unit? ");
            double howMuch = input.nextDouble();
            itemPrice.add(howMuch);

            input.nextLine(); 
            System.out.print("Add more items? (yes/no) ");
            String option = input.nextLine();
            if (option.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.print("Cashier's name? ");
        String cashier = input.nextLine();

        System.out.print("How much discount will they get? ");
        double discount = input.nextDouble();

        System.out.println("\nSEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03293828343\nDATE: 18-DEC-24 8:48:11PM\n");
        System.out.printf("Cashier: %s%nCustomer Name: %s%n", cashier, name);
        System.out.println("======================================================");
        System.out.printf("%s\t%s\t%s\t%s", "Item", "QTY", "PRICE", "TOTAL");

        double subTotal = 0.0;
        for (int i = 0; i < itemsBought.size(); i++) {
            System.out.printf("%n%s\t%d\t%.2f\t%.2f", itemsBought.get(i), itemsQuantity.get(i), itemPrice.get(i), itemsQuantity.get(i) * itemPrice.get(i));
            subTotal += itemsQuantity.get(i) * itemPrice.get(i);
        }

        double totalDiscount = subTotal * (discount / 100);
        double VAT = subTotal * (17.50 / 100);
        double billTotal = (subTotal - totalDiscount) + VAT;

        System.out.println("\n-----------------------------------------------------------------------------------");
        System.out.printf("Subtotal: %.2f%nDiscount: %.2f%nVAT @ 17.50: %.2f%n", subTotal, totalDiscount, VAT);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("Bill Total: %.2f%n", billTotal);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("THIS IS NOT A RECEIPT, KINDLY PAY " + billTotal);
        System.out.println("------------------------------------------------------------------------------------");

        System.out.print("How much did the customer give you? ");
        double payment = input.nextDouble();

        if (payment > billTotal) {
            double change = payment - billTotal;
            System.out.println("\nSEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03293828343\nDATE: 18-DEC-24 8:48:11PM\n");
            System.out.printf("Cashier: %s%nCustomer Name: %s%n", cashier, name);
            System.out.println("======================================================");
            System.out.printf("%s\t%s\t%s\t%s", "Item", "QTY", "PRICE", "TOTAL");

            for (int i = 0; i < itemsBought.size(); i++) {
                System.out.printf("%n%s\t%d\t%.2f\t%.2f", itemsBought.get(i), itemsQuantity.get(i), itemPrice.get(i), itemsQuantity.get(i) * itemPrice.get(i));
            }

            System.out.println("\n-----------------------------------------------------------------------------------");
            System.out.printf("Subtotal: %.2f%nDiscount: %.2f%nVAT @ 17.50: %.2f%n", subTotal, totalDiscount, VAT);
            System.out.println("------------------------------------------------------------------------------------");
            System.out.printf("Bill Total: %.2f%n", billTotal);
            System.out.printf("Amount Paid: %.2f%n", payment);
            System.out.printf("Balance: %.2f%n", change);
            System.out.println("------------------------------------------------------------------------------------");
        } else {
            System.out.println("Not enough money.");
        }
    }
}
