// Create a String intToRoman(int number) method of the MyUtils class to convert integer to Roman numerals. The "number" must be positive and do not exceed 3999. Otherwise, throw an IllegalArgumentException.
// For example, for a given sequence of integer numbers
// 5 9 19 91 3999
// you should get
// V IX XIX XCI MMMCMXCIX
// For more information, see https://en.wikipedia.org/wiki/Roman_numerals and http://www.onlineconversion.com/roman_numerals_advanced.htm


class MyUtils {
    public String intToRoman(int number) {
        if (number <= 0 || number > 3999){
            throw new  IllegalArgumentException();
        }
        String[] romans = { "M",  "CM", "D", "C",  "XC", "L",  "X", "IX", "V", "I" };
        int[] ints = {  1000, 900, 500, 100, 90, 50, 10, 9, 5, 1 };
        String result = "";

        for (int i = 0; i < ints.length; i++) {
            int numberInPlace = number / ints[i];
            if (numberInPlace == 0) continue;
            result += numberInPlace == 4 && i > 0? romans[i] + romans[i - 1]:
                    new String(new char[numberInPlace]).replace("\0",romans[i]);
            number = number % ints[i];
        }
        return result;

    }
}
