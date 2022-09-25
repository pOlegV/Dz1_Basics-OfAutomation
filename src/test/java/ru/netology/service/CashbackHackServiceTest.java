package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldCalculateRemainWithZeroAmount() {
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainWithAmountUnderBoundary() {
        int amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainWithAmountOverBoundary() {
        int amount = 1001;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainWithAmountEqualsBoundary() {
        int amount = 10000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}