package fintech.driver;

/**
 * @author 12S23030-Simorangkir Jonathan
 * @author 12S23046-Anastasya T.B. Siahaan
 */
public class Driver2 {

    public static void main(String[] _args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String owner = scanner.nextLine();
        String accountName = scanner.nextLine();

        Account account = new Account(owner, accountName);

        String command2 = scanner.nextLine();
        String accountName2 = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        String postedat = scanner.nextLine();
        String note = scanner.nextLine();

        Transaction transaction = new Transaction(0, accountName2, amount, postedat, note, account);

        System.out.println(account);
        System.out.println(transaction);

        scanner.close();

    }

}