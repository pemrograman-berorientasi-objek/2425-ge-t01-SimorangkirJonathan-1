package fintech.driver;

import java.util.Scanner;
import fintech.model.Account;

/**
 * @author 12S23030-Simorangkir jonathan
 * @author 12S23046-Anastasya T.B Siahaan
 */
public class Driver1 {

    public static void main(String[] _args) {
        Scanner com = new Scanner(System.in);
        double balance = 0.0;

        String command = com.nextLine();
        String owner = com.nextLine();
        String accountname = com.nextLine();

        if (command.equals("create-account")) {
            Account acc = new Account(owner, accountname);
            System.out.println(acc.toString());
        }
        com.close();

    }

}
