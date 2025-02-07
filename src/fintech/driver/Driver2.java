package fintech.driver;

import java.util.Scanner;
import fintech.model.Transaction;

/**
 * @autor 12S23030-Simorangkir jonathan
 * @autor 12S23046-Anastasya T.B Siahaan
 */
public class Driver2 {

    public static void main(String[] _args) {
        Scanner com = new Scanner(System.in);

        String command = com.nextLine();
        String transactionId = com.nextLine();
        String accountName = com.nextLine();
        double amount = com.nextDouble();
        com.nextLine(); // consume the newline character
        String type = com.nextLine();

        if (command.equals("create-transaction")) {
            Transaction transaction = new Transaction(transactionId, accountName, amount, type);
            System.out.println(transaction.toString());
        }
        com.close();
    }
}