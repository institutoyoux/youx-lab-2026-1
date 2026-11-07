package s13_Herança_polimorfismo.al1_herança.application;

import s13_Herança_polimorfismo.al1_herança.entities.Account;
import s13_Herança_polimorfismo.al1_herança.entities.SavingsAccount;


public class Program {
    public static void main(String[] args) {
        //introducao ao polimorfismo

        Account x  = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0,0.01);

        x.withdraw((50.0));
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());








        //Account acc1 = new Account(1001,"Alex", 1000.0);
       // acc1.withdraw(200.0);
       // System.out.println(acc1.getBalance());

       // Account acc2 = new SavingsAccount(1002,"Maria", 1000.0,0.01 );
       // acc2.withdraw((200.0));
       // System.out.println(acc2.getBalance());

        //Account acc3 = new BusinessAccount(1003,"bob", 1000.0, 500.0);
        //acc3.withdraw(200);
       // System.out.println(acc3.getBalance());





       // Account acc = new Account(1001, "Alex", 0.0);

       // BusinessAccount bcc = new BusinessAccount(1002,"Maria", 0.0,500.0);

       // Account acc1 = bcc ;

        //Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.0);
       // Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.1);


        //BusinessAccount acc4 =(BusinessAccount)acc2;
        //acc4.loan(100.0);

      //  BusinessAccount acc5 = (BusinessAccount)acc3;

        //if(acc3 instanceof BusinessAccount ) {
           // BusinessAccount acc5 = (BusinessAccount)acc3;
           // acc5.loan(200.0);
           // System.out.println("Loan!");

        //}
        //if (acc3 instanceof SavingsAccount) {
           // SavingsAccount acc5 = (SavingsAccount) acc3;
          //  acc5.updateBalance();
          //  System.out.println("Update!");
      //  }













//        Account a1  = new Account(1,"Joao", 56.0);
//        Account a2  = new BusinessAccount(2,"Flavio", 57.0,10.0);
//        Account a3  = new BusinessAccount(3,"Maria", 85.0,10.0);
//
//
//        List<Account> lista = new ArrayList<>();
//
//        lista.add(a1);
//        lista.add(a2);
//        lista.add(a3);
//
//        for (Account a : lista){
//            System.out.println(a.getHolder());
//        }

    }
}
