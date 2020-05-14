// Write a method to convert date and time, represented via Date object to object of Calendar type.
// * For correct passing of all tests don't use print and println methods in your code.


public static Calendar convertDateToCalendar(Date date) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    return calendar;
}
