package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void SumAllMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sumAllMonthSales(sales);

        assertEquals(180, actual);
    }

    @Test
    void MidMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.midMonthSales(sales);

        assertEquals(15, actual);
    }

    @Test
    void MonthSalesMax() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthSalesMax(sales);

        assertEquals(8, actual);
    }

    @Test
    void MonthSalesMin() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthSalesMin(sales);

        assertEquals(9, actual);
    }

    @Test
    void UnderMidMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.underMidMonthSales(sales);

        assertEquals(5, actual);

    }

    @Test
    void OverMidMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.overMidMonthSales(sales);

        assertEquals(5, actual);

    }
}