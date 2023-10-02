package ru.netology.stats.StatsService;

public class StatsService {

    public int getMinSales(int[] sales) {
        int minMonth = 0;//номер месяца с минимальным продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {//значит в расматриваемом i-месяце продаж меньше
                minMonth = i;//запомним его как минимальный
            }
        }

        return minMonth + 1;//
    }


    public int getArreySum() {
        StatsService service = new StatsService();

        int[] arrey = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = 0;
        int averageSum = sum / 12;
        for (int num : arrey) {
            sum = sum + num;
            averageSum = sum / 12;

        }
        return sum;
        //return averageSum;
    }


    public int getAveragySum() {
        StatsService service = new StatsService();

        int[] arrey = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = 0;
        int averageSum = sum / 12;
        for (int num : arrey) {
            sum = sum + num;
            averageSum = sum / 12;
        }

        return averageSum;
    }


    public int getMaxSales(int[] sales) {
        int maxMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int getBelowAverageSum(int[] ba) {
        int sum = 0;
        int average = 0;
        int count = 0;

        for (int i = 0; i < ba.length; i++) {
            sum = sum + ba [i];
        }
        average = sum / ba.length;

        for (int i = 0; i < ba.length; i++) {
            if (ba [i] < average) {
                count++;
            }
        }
        return count;
    }

    public int getAboveAverageSum(int[] ba) {
        int sum = 0;
        int average = 0;
        int count = 0;

        for (int i = 0; i > ba.length; i++) {
            sum = sum + ba [i];
        }
        average = sum / ba.length;

        for (int i = 0; i > ba.length; i++) {
            if (ba [i] > average) {
                count++;
            }
        }
        return count;
    }
}



















