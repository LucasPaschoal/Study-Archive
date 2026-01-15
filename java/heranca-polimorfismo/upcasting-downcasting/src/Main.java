import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

void main() {
    Account account = new Account(1001, "Alex", 1000.0);
    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

    //UPCASTING
    Account acc1 = bacc;
    Account acc2 = new BusinessAccount(1003, "John", 0.0, 300.0);
    Account acc3 = new SavingsAccount(1004, "Carlos", 1000.0, 000.01);

    //Downcasting
    BusinessAccount acc4 = (BusinessAccount)acc2;
    acc4.loan(100.0);

    // BusinessAccount acc5 = (BusinessAccount)acc3;
    if(acc3 instanceof BusinessAccount) {
        BusinessAccount acc5 = (BusinessAccount)acc3;
        acc5.loan(100.0);
        System.out.println("Loan!");
    }

    if(acc3 instanceof SavingsAccount) {
        SavingsAccount acc5 = (SavingsAccount)acc3;
        acc5.updateBalance();
        System.out.println("Update!");
    }

    Account acc6 = new Account(1005, "John", 1000.0);
    Account acc7 = new SavingsAccount(1006, "Carlos", 1000.0, 000.01);
    //Override testes
    acc6.withdraw(200.0);
    System.out.println(acc6.getBalance());
    acc7.withdraw(200.0);
    System.out.println(acc7.getBalance());


}

