package ru.netology.stats;


public class StatsService {
    public long SumAllMonthSales(long[] sales) {
        long sum = 0;
        for (long monthSale : sales) {
            sum += monthSale;
        }
        return sum;
    }

    public long MidMonthSales(long[] sales) {
        long sum = 0;
        long midsales = 0;
        for (long monthSale : sales) {
            sum += monthSale;
            midsales = sum / 12;
        }
        return midsales;
    }


    public long MonthSalesMax(long[] sales) {
        long currentMax = sales[0];
        for (long sale : sales) {
            if (currentMax < sale) {
                currentMax = sale;
            }
        }

        int month = 0;
        int maxMonth = 0;
        for (long sale : sales) {
            month = month + 1;
            if (sale == currentMax) {
                maxMonth = month;
            }
        }
        return maxMonth;
    }

    public long MonthSalesMin(long[] sales) {
        long currentMin = sales[0];
        for (long sale : sales) {
            if (currentMin > sale) {
                currentMin = sale;
            }

        }
        int month = 0;
        int minMonth = 0;
        for (long sale : sales) {
            month = month + 1;
            if (sale == currentMin) {
                minMonth = month;
            }
        }
        return minMonth;
    }

    public long UnderMidMonthSales(long[] sales) {
        long sum = 0;
        long midsales = 0;
        for (long Sale : sales) {
            sum += Sale;
            midsales = sum / 12;
        }
        int sumMonth = 0;
        for (long sale : sales) {
            if (sale < midsales) {
                sumMonth = sumMonth + 1;

            }
        }
        return sumMonth;
    }

    public long OverMidMonthSales(long[] sales) {
        long sum = 0;
        long midsales = 0;
        for (long Sale : sales) {
            sum += Sale;
            midsales = sum / 12;
        }
        int sumMonth = 0;
        for (long sale : sales) {
            if (sale > midsales) {
                sumMonth = sumMonth + 1;

            }
        }
        return sumMonth;
    }
}

