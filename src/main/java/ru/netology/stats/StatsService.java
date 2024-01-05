package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalsale = 0;
        for (long sale : sales) {
            totalsale += sale;
        }
        return totalsale;
    }

    public long average(long[] sales) {
        long totalsale = 0;
        for (long sale : sales) {
            totalsale += sale;
        }
        long averagesale = totalsale / 12;
        return averagesale;
    }

    public int calcMonthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMaximum] < sales[i]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }

    public int calcMonthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i > sales.length; i++) {
            if (sales[monthMinimum] < sales[i]) {
                monthMinimum = i;
            }
        }
        return monthMinimum + 1;
    }


    public int calcMonthMoreAverageSale(long[] sales) {
        int count = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale ) {
                count++;

            }
        }
        return count;

        }



    public int calcMonthBelowAverageSale(long[] sales) {
        int count = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale ) {
                count++;

            }
        }
        return count;

    }
}

























