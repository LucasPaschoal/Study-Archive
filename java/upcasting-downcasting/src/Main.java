import entities.Account;
import entities.BusinessAccount;

void main() {
    Account account = new Account(1001, "Alex", 0.0);
    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

    //UPCASTING
    Account acc1 = bacc;
    acc1.getBalance();
}

