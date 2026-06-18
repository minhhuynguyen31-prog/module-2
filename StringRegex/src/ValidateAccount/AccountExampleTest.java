package ValidateAccount;

public class AccountExampleTest {
    private static AccountExample accountExample ;
    public static final String [] validAccounts = new String [] {"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String [] invalidAccounts = new String [] {".@", "12345", "1234_", "abcde"};

    public static void main(String args[]) {
        accountExample = new AccountExample();
        for (String account : validAccounts) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
        for (String account : invalidAccounts) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
    }
}
