package ru.netology.stats.StatsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;

        int actualMonth = service.getMinSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void shouldFindArreySum() {
        StatsService service = new StatsService();

        int[] arrey = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;

        int actualSum = service.getArreySum();

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageSum() {
        StatsService service = new StatsService();

        int[] arrey = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;

        int actual = service.getAveragySum();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;

        int actualMonth = service.getMaxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}


   // @Test
    //public void shouldAverageSales() {
     //   int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

      //  int actualMonth = service.getAverageSales(sales);

     //   Assertions.assertEquals(expectedMonth, actualMonth);
   // }
//}

// return calculateSumSales(sales)/sales.length;
//  }