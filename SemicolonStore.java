import java.util.Scanner;

public class SemicolonStore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the customer's name: ");
        String clientName = input.nextLine();

        String billDetails = "";
        double totalAmount = 0.0;
        String moreItems;

        do {
            System.out.println("What did the customer buy? ");
            String product = input.nextLine();

            System.out.println("How many pieces? ");
            int pieces = input.nextInt();

            System.out.println("How much per unit#? ");
            double pricePerUnit = input.nextDouble(); 

            double itemTotal = pieces * pricePerUnit;
            totalAmount += itemTotal;

            billDetails += product + "\t\t" + pieces + "\t\t" + pricePerUnit + "\t\t" + itemTotal + "\n";

            input.nextLine();
            System.out.println("Add more items? (yes/no): ");
            moreItems = input.nextLine();
        } while (moreItems.equalsIgnoreCase("yes"));

        System.out.println("What is your (Cashier's Name) name?");
        String cashierName = input.nextLine();

        System.out.println("How much discount will the customer get?");
        double rebate = input.nextDouble();

        double vatRate = 0.0;
        double vatAmount = totalAmount * vatRate;
        double payableAmount = totalAmount - rebate;    

        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 83293828343");
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + clientName);
        System.out.println("\nITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)");
        System.out.println("============================================================");
        System.out.println(billDetails);
        System.out.println("------------------------------------------------------------");
        System.out.println("\t\tGrand Total: " + "\t\t\t" + totalAmount);
        System.out.println("\t\tDiscount: " + "\t\t\t" + rebate);
        System.out.println("\t\tVAT @ 0.00%:" + "\t\t\t" + vatAmount);
        System.out.println("============================================================");
        System.out.println("\t\Total Bill:" + "\t\t\t" + payableAmount);
        System.out.println("============================================================");
        System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + payableAmount);
        System.out.println("============================================================");

        System.out.println("How much did the customer give to you?");
        double amountReceived = input.nextDouble();

        double change = amountReceived - payableAmount;
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 83293828343");
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + clientName);
        System.out.println("\nITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)");
        System.out.println("============================================================");
        System.out.println(billDetails);
        System.out.println("------------------------------------------------------------");
        System.out.println("\t\tGrand Total: " + "\t\t\t" + totalAmount);
        System.out.println("\t\tDiscount: " + "\t\t\t" + rebate);
        System.out.println("\t\tVAT @ 0.00%:" + "\t\t\t" + vatAmount);
        System.out.println("============================================================");
        System.out.println("\t\Total Bill:" + "\t\t\t" + payableAmount);
        System.out.println("\t\tAmount paid:" + "\t\t\t" + amountReceived);
        System.out.println("\t\tBalance:" + "\t\t\t" + change);
        System.out.println("============================================================");
        System.out.println("THANKS FOR YOUR PATRONAGE");
        System.out.println("============================================================");
    }
}
