// Write a method to check if a year is a leap year or not, using for this the LocalDate class.
// If a year is leap then method should return true, otherwise - false.
// * For correct passing of all tests don't use print and println methods in your code.

public static boolean isLeapYear(int year) {
    return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? true : false;
}
