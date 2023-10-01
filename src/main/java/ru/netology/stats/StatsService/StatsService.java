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



    public int getMaxSales (int[] sales) {
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
}








