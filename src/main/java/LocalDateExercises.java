import java.time.LocalDate;

public class LocalDateExercises {
    /**
     * A method reads @param inputYear and @param inputDayOfYear and checks if this day is the first day of a month
     * or not.
     *
     * @return true if this day is the first day of the month
     */

    public static boolean firstDayOrNot(int inputYear, int inputDayOfYear) {
        LocalDate date = LocalDate.ofYearDay(inputYear, inputDayOfYear);
        final int dayOfMonth = date.getDayOfMonth();
        return dayOfMonth == 1;
    }
}
