package org.Deposit;

import org.Deposit.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @Test
    void deposit() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void withdraw() {
        account.deposit(200.0);
        assertEquals(50.0, account.withdraw(50.0));
        assertEquals(0.0, account.withdraw(200.0));
    }

    @Test
    void getBalance() {
        assertEquals(0.0, account.getBalance());
        account.deposit(75.0);
        assertEquals(75.0, account.getBalance());
    }
}