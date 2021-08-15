public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setChecking(50000);
        double check = b.getChecking();
        System.out.println(check);
    }
}
    