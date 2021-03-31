package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void SumAllMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.SumAllMonthSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void MidMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.MidMonthSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void MonthSalesMax() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.MonthSalesMax(sales);

        assertEquals(expected, actual);
    }

    @Test
    void MonthSalesMin() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.MonthSalesMin(sales);

        assertEquals(expected, actual);
    }

    @Test
    void UnderMidMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.UnderMidMonthSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void OverMidMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.OverMidMonthSales(sales);

        assertEquals(expected, actual);

    }
}