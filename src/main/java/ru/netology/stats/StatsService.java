package ru.netology.stats;


public class StatsService {
    public long sumAllMonthSales(long[] sales) {
        long sum = 0;
        for (long monthSale : sales) {
            sum += monthSale;
        }
        return sum;
    }

    public long midMonthSales(long[] sales) {
        return this.sumAllMonthSales(sales) / 12;
    }


    public long monthSalesMax(long[] sales) {
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

    public long monthSalesMin(long[] sales) {
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

    public long underMidMonthSales(long[] sales) {
        int sumMonth = 0;
        for (long sale : sales) {
            if (sale < this.midMonthSales(sales)) {
                sumMonth = sumMonth + 1;

            }
        }
        return sumMonth;
    }

    public long overMidMonthSales(long[] sales) {

        int sumMonth = 0;
        for (long sale : sales) {
            if (sale > this.midMonthSales(sales)) {
                sumMonth = sumMonth + 1;

            }
        }
        return sumMonth;
    }
}

