package fintech.driver;

import java.util.Scanner;

/**
 * @author 12S23030-Simorangkir jonathan
 * @author 12S23046-Anastasya Tabitha Blessing Siahaan
 */
public class Driver1 {

    public static void main(String[] _args) {
        Scanner Command = new Scanner(System.in);
        Scanner Owner = new Scanner(System.in);
        Scanner Accountname = new Scanner(System.in);
        double balance = 0.0;

        String command = Command.nextLine();
        String owner = Owner.nextLine();
        String accountname = Accountname.nextLine();

        if (command.equals("create-account")) {
            System.out.println(accountname + "|" + owner + "|" + balance);
        } else {
            System.out.println("failed");
        }

        Command.close();
        Owner.close();
        Accountname.close();

    }

}
