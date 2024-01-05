package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StatsServiceTest {
     @Test
    public void testSum() {
         long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
                 StatsService service = new StatsService();

         long actual = service.sum(sales);
         long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

         assertEquals(actual, expected);
     }


    @Test
    public void testAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
         assertEquals(expected,actual);



    }





    @Test
    public void testMounthMaximum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();


        long actual = service.calcMonthMaximumSale(sales);
        long expected = 6;
        assertEquals(expected, actual);

    }



    @Test
    public void testMounthMinimum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();


        long actual = service.calcMonthMinimumSale(sales);
        long expected = 1;
        assertEquals(expected, actual);

    }


    @Test
    public void testMonthMoreAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();


        long actual = service.calcMonthMoreAverageSale(sales);
        long expected = 5;
        assertEquals(expected, actual);

    }


    @Test
    public void testMonthBelowAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();


        long actual = service.calcMonthBelowAverageSale(sales);
        long expected = 5;
        assertEquals(expected, actual);

    }










}
