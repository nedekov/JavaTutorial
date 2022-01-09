package DataStructuresAssignment;

//5. Create the most suitable data structure for the days of the week.

public class DaysOfTheWeekStructure {

    public enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args)
    {
        Day mon = Day.MONDAY;
        Day tue = Day.TUESDAY;
        Day wed = Day.WEDNESDAY;
        Day thu = Day.THURSDAY;
        Day fri = Day.FRIDAY;
        Day sat = Day.SATURDAY;
        Day sun = Day.SUNDAY;

        System.out.println(mon + "," + tue + "," +  wed + "," + thu + "," + fri + "," + sat + "," + sun + " are the days of the week.");

    }
}
