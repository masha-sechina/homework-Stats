package ru.netology.stats;

public class StatsService {

    public int salesSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int averageSalesSum(int[] sales) {
        int average = salesSum(sales) / sales.length;
        return average;
    }

    public int lastMonthWithMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int lastMonthWithMinimalSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int salesBelowAverage(int[] sales) {
        int average = salesSum(sales) / sales.length;
        int numberOfMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                numberOfMonths = numberOfMonths + 1;
            }
        }
        return numberOfMonths;
    }

    public int salesAboveAverage(int[] sales) {
        int averageSum = averageSalesSum(sales);
        int numberOfMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                numberOfMonths = numberOfMonths + 1;
            }
        }
        return numberOfMonths;
    }
}


