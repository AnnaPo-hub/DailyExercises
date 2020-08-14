import java.time.LocalDate;

public class LocalDateExercises {
    /**
     * A method reads @param year, @param month ,  @param offset  from the of the month  and  and outputs the date.
     */

    public static void dayFromEndOfMonth(int year, int month, int offset) {
        LocalDate date = LocalDate.of(year, month, 1).plusMonths(1).minusDays(offset);
        System.out.println(date);
    }

    /**
     * A method reads @param inputYear and @param inputMonth and outputs the first and the last day of given month.
     */

    public static void firstAndLastDayOfAMonth(int inputYear, int inputMonth) {
        LocalDate firstDayOfMonth = LocalDate.of(inputYear, inputMonth, 1);
        LocalDate lastDayOfMonth = LocalDate.of(inputYear, inputMonth, 1).plusMonths(1).minusDays(1);
        System.out.print(firstDayOfMonth + " ");
        System.out.println(lastDayOfMonth);
    }

    /**
     * A method reads @param inputYear and @param inputDayOfYear and checks if this day is the first day of a month
     * or not.
     * @return true if this day is the first day of the month
     */

    public static boolean firstDayOrNot(int inputYear, int inputDayOfYear) {
        LocalDate date = LocalDate.ofYearDay(inputYear, inputDayOfYear);
        final int dayOfMonth = date.getDayOfMonth();
        return dayOfMonth == 1;
    }
}
