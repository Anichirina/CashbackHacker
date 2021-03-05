package ru.netology.service;

import static org.junit.Assert.assertEquals;


public class CashbackHackerTest {
    CashbackHacker cashbackHacker = new CashbackHacker();

    @org.junit.Test
    public void shouldReturn1000() {
               assertEquals(0, cashbackHacker.remain(1000));

    }

    @org.junit.Test
    public void shouldReturn100For900() {

        assertEquals(100, cashbackHacker.remain(900));

    }

    @org.junit.Test
    public void shouldReturn50for950() {
        assertEquals(950, cashbackHacker.remain(50));
    }

    @org.junit.Test
    public void shouldReturnLessOf1000() {

        assertEquals(500, cashbackHacker.remain(500));

    }

    @org.junit.Test
    public void shouldReturnNull() {
                assertEquals(1000, cashbackHacker.remain(0));

    }


}



