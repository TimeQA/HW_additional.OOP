import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDate {

    private int day;
    private int month;
    private int year;

    public RandomDate dayBounds(int form, int to) {
        day = randomValue(form, to);
        return this;
    }

    public RandomDate monthBounds(int form, int to) {
        month = randomValue(form, to);
        return this;
    }

    public RandomDate yearBounds(int form, int to) {
        year = randomValue(form, to);
        return this;
    }


    private int randomValue(int origin, int bound) {
        return ThreadLocalRandom.current().nextInt(origin, bound);
    }

    public LocalDate generateDefault() {
        int day = randomValue(1, 20);
        int month = randomValue(1, 13);
        int year = randomValue(1900, 2022);

        return LocalDate.of(year, month, day);
    }

    public LocalDate generate() {
        return LocalDate.of(year, month, day);
    }
}
