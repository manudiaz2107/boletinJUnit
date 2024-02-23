package boletinJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testDeposit() {
        Account account = new Account("Manu", 123456, 1000);

        // Prueba depositando una cantidad positiva
        assertTrue(account.deposit(500));
        assertEquals(1500, account.getBalance(), 0.001);

        // Prueba depositando una cantidad negativa
        assertFalse(account.deposit(-200));
        assertEquals(1500, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        Account account = new Account("Jose", 654321, 2000);

        // Prueba retirando una cantidad válida sin tarifa
        assertTrue(account.withdraw(500, 0));
        assertEquals(1500, account.getBalance(), 0.001);

        // Prueba retirando una cantidad mayor al saldo
        assertFalse(account.withdraw(2000, 0));
        assertEquals(1500, account.getBalance(), 0.001);

        // Prueba retirando una cantidad válida con tarifa
        assertTrue(account.withdraw(300, 10));
        assertEquals(1190, account.getBalance(), 0.001);

        // Prueba retirando una cantidad negativa
        assertFalse(account.withdraw(-100, 5));
        assertEquals(1190, account.getBalance(), 0.001);
    }

    @Test
    public void testAddInterest() {
        Account account = new Account("David", 987654, 1500);

        // Prueba añadiendo interés
        account.addInterest();
        assertEquals(1500 + (1500 * 0.045), account.getBalance(), 0.001);
    }
}