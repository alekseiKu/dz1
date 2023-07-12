package ru.netology.service;


import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;


public class CashbackHackServiceTest {
    CashbackHackService cashback = new CashbackHackService();

    @Test
    public void shouldCalculateCashBackEqual1000() {
        int amount = 1000;

        int expected = 0;
        int actual = cashback.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateCashBackAbove1000() {
        int amount = 1200;

        int expected = 800;
        int actual = cashback.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateCashBackBelow1000() {
        int amount = 800;

        int expected = 200;
        int actual = cashback.remain(amount);

        assertEquals(actual, expected);
    }
}