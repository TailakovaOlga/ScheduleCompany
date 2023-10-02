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

    @Test
    public void shouldFindBelowAverageSum() {
        StatsService service = new StatsService();

        int[] ba = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAverageSum = 5;

        int actualBelowAverageSum = service.getBelowAverageSum(ba);

        Assertions.assertEquals(expectedBelowAverageSum, actualBelowAverageSum);
    }

    @Test
    public void shouldFindAboveAverageSum() {
        StatsService service = new StatsService();

        int[] ba = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAverageSum = 5;

        int actualBelowAverageSum = service.getBelowAverageSum(ba);

        Assertions.assertEquals(expectedBelowAverageSum, actualBelowAverageSum);
    }
}
   // public int getBelowAverageSum(int[] ba) {
    //    int sum = 0;
     //   int average = 0;
      //  int count = 0;

      //  for (int i = 0; i < 15; i++) {
       //     sum = sum + ba [i];
      //  }
       // average = sum / 15;

      //  for (int i = 0; i < 15; i++) {
         //   if (ba [i] < average) {
          //      count++;
          //  }
       // }
       // return count;
   // }
//}

   // @Test
    //public void shouldAverageSales() {
     //   int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

      //  int actualMonth = service.getAverageSales(sales);

     //   Assertions.assertEquals(expectedMonth, actualMonth);
   // }
//}

// return calculateSumSales(sales)/sales.length;
//  }