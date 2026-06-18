package ReguiLarExpression;

public class Test {
    private static EmailEx emailex;
    public static final String[] validemails = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
    public static void main(String args[]) {
        emailex = new EmailEx();
        for (String email : validemails) {
            boolean isvalid = emailex.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailex.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
    }
}
