package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void calculateTotalSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService services = new StatsService();

        long actual = services.calculateTotalSale(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateAverageSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService services = new StatsService();

        long actual = services.calculateAverageSale(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateMonthMax() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService services = new StatsService();

        long actual = services.getMonthMaxSale(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateMonthMin() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService services = new StatsService();

        long actual = services.getMonthMinSale(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateMonthsBelowAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService services = new StatsService();

        long actual = services.calculateMonthsBelowAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateMonthsHigherAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService services = new StatsService();

        long actual = services.calculateMonthsHigherAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);

    }
}
