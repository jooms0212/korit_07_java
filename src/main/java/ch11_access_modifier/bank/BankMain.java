package ch11_access_modifier.bank;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        bank1.setAccountNum(123456);
        bank1.setAccountHolder("홍길동");
        bank1.setBalance(100000);
        bank1.setPinNumber(1004);

        bank2.setAccountNum(987654);
        bank2.setAccountHolder("신사임당");
        bank2.setBalance(500000);
        bank2.setPinNumber(1000);

        bank1.showAccountInfo();
        bank2.showAccountInfo();
        System.out.println();

        bank1.deposit(50000, 1004);
        bank1.withdraw(200000, 1004);
        bank1.withdraw(100000, 1004);
        System.out.println();

        bank2.withdraw(100000, 1000);
        bank2.deposit(200000, 1000);

        bank1.showAccountInfo();
        bank2.showAccountInfo();


        // 잔액이 마이너스인 계좌 생성하는 방법
        Bank bank4 = new Bank(13579, "김사", 789456, -3000);
        bank4.showAccountInfo();


    }
}
