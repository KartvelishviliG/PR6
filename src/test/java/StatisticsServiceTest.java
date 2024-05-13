import org.example.StatisticsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithMaxInTheMiddle() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {1, 2, 10, 4, 5};
        long expected = 10;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithMaxAtTheEnd() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {1, 2, 4, 6, 100};
        long expected = 100;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenAllValuesAreEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {5, 5, 5, 5, 5};
        long expected = 5;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithNegativeValues() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {-10, -20, -3, -4, -5};
        long expected = -3;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxIsFirstAndLast() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {100, 2, 3, 4, 100};
        long expected = 100;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }
}
