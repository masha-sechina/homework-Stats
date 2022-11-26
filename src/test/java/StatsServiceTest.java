
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;


public class StatsServiceTest {

    @Test
    public void calculationTotalSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.salesSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);


    }

    @Test
    public void calculationAverageSalesAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSalesSum(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void calculationLastMonthWithMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.lastMonthWithMaxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);


    }


    @Test
    public void calculationLastMonthWithMinimalSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.lastMonthWithMinimalSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }


    @Test
    public void calculationNumberOfMonthAverageSalesAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumber = 5;
        int actualNumber = service.salesBelowAverage(sales);

        Assertions.assertEquals(expectedNumber, actualNumber);

    }

    @Test
    public void calculationNumberOfMonthAboveSalesAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumber = 5;
        int actualNumber = service.salesAboveAverage(sales);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }

}
