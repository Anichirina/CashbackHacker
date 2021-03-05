package ru.netology.service;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashbackHackerTest {
    CashbackHacker cashbackHacker = new CashbackHacker();

    @Test
    public void shouldReturn1000() {
               assertEquals(0, cashbackHacker.remain(1000));

    }

    @Test
    public void shouldReturn100For900() {

        assertEquals(100, cashbackHacker.remain(900));

    }

    @Test
    public void shouldReturn50for950() {
        assertEquals(950, cashbackHacker.remain(50));
    }

    @Test
    public void shouldReturnLessOf1000() {

        assertEquals(500, cashbackHacker.remain(500));

    }

    @Test
    public void shouldReturnNull() {
                assertEquals(1000, cashbackHacker.remain(0));

    }


}



