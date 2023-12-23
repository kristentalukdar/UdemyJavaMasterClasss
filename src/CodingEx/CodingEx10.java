package CodingEx;

public class CodingEx10 {
        private static  int MIN_PER_HOUR = 60;
        private static  int HOURS_PER_DAY = 24;
        private static  int DAYS_PER_YEAR = 365;
        private static  int MIN_PER_DAY = HOURS_PER_DAY * MIN_PER_HOUR;
        private static  int MIN_PER_YEAR = MIN_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;

        public static void printYearsAndDays(long minutes) {

            if (minutes < 0) {
                System.out.println("Invalid Value");
                return;
            }
            long years = minutes / MIN_PER_YEAR;
            long days = (minutes / MIN_PER_DAY) % DAYS_PER_YEAR;
            System.out.println(minutes + " min = " + years  + " y and " + days + " d");
        }

    public static void main(String[] args) {

    }

}
