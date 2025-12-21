package application;

import entities.Account;
import entities.BusinessAccount;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        System.out.println(bacc.getBalance());
    }
}
