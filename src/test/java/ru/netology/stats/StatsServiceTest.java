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





}
