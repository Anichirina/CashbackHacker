package ru.netology.service;

import org.testng.ISuite;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.Callable;

import static org.testng.Assert.*;

public class CashbackHackerTest {
    CashbackHacker cashbackHacker = new CashbackHacker();

    @org.testng.annotations.Test
    public void shouldReturn1000() {
               int actual = cashbackHacker.remain(1000);
               int expected = 0;
               assertEquals(actual,expected);



        }
    @org.testng.annotations.Test
    public void shouldReturn100For900() {
        int actual = cashbackHacker.remain(900);
        int expected = 100;
        assertEquals(actual,expected);



    }
    @org.testng.annotations.Test
    public void shouldReturn50for950() {
        assertEquals(cashbackHacker.remain(50),950);
    }

    @org.testng.annotations.Test
    public void shouldReturnLessOf1000() {
        int actual = cashbackHacker.remain(500);
        int expected = 500;
        assertEquals(actual,expected);



    }

    @org.testng.annotations.Test
    public void shouldReturnNull() {
        int actual = cashbackHacker.remain(0);
        int expected = 1000;
        assertEquals(actual,expected);



    }




}



