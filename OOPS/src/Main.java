public class Main {
    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount();
//        bankAccount.accountSummary();
//        BankAccount bankAccoun = new BankAccount(bankAccount);
//        bankAccoun.accountSummary();
//        bankAccount.setCustomerName("Sanskar Khatri");
//        bankAccount.setAccountNumber(111111);
//        bankAccount.deposit(100);
//        bankAccount.accountSummary();
//        bankAccount.withdraw(50);
        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i) {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
                    },
                    "5/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }
    }
}