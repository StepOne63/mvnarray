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
        for (int i = 0; i < sales.length; i++){
            if (sales[monthMaximum] < sales[i]){
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }
}







