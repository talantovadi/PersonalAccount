public class Main {    public static void main(String[] args) {
    PersonalAccount pa = new PersonalAccount(500000, "Dilbar");
    pa.deposit(5000);
    pa.deposit(15000);
    pa.withdraw(3000);
    pa.withdraw(20000);
    System.out.println(pa.getBalance());
    pa.printTransactionHistory();
}}