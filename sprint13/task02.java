// Write a method to get the name of last day of the given month in given year.
// Use GregorianCalendar class to solve this exercise.
// The name of day must corresponds next format: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
// If month isn't correct then name is "Wrong Month".
// * For correct passing of all tests don't use print and println methods in your code.


public static String lastDayOfMonth(int month, int year){
        if (month > 12) return "Wrong Month";
        int dayOfMonth;
        if (month < 6){
            dayOfMonth = month % 2 == 0 ? 31 : 30;
        }else { 
            dayOfMonth = month % 2 == 0 ? 30 : 31;
        }

        GregorianCalendar calendar = new GregorianCalendar(year, month, dayOfMonth);
        int i = calendar.get(Calendar.DAY_OF_WEEK);
        String dayOfTheWeek = "";

        if(i == 2){
            dayOfTheWeek = "Monday";
        } else if (i==3){
            dayOfTheWeek = "Tuesday";
        } else if (i==4){
            dayOfTheWeek = "Wednesday";
        } else if (i==5){
            dayOfTheWeek = "Thursday";
        } else if (i==6){
            dayOfTheWeek = "Friday";
        } else if (i==7){
            dayOfTheWeek = "Saturday";
        } else if (i==1){
            dayOfTheWeek = "Sunday";
        }

        return dayOfTheWeek;
    }
