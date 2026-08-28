package entities.accountFile;
import entities.accountFile.Account;
public class Program {

    public static void main(String[] args){

        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 670.0, 500.0);

        Account acc = new Account(1001,"Alex",0.0);

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);

        BusinessAccount acc4 = (BusinessAccount) acc2;


        acc4.loan(100.0);

        System.out.println(acc1.getBalance());
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());
//        BusinessAccount acc5 = (BusinessAccount) acc3;
    }
}
