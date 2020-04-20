// Create a LineType enum that contains different kind of lines as constants SOLID, DOTTED, DASHED and DOUBLE.
// Write a method that takes the constant of LineType type as input, and returns the message “The line is <LineType> type”.
// Where <LineType>  is name of type wrote in lower case. For example: "The line is dotted type".

// * For correct passing of all tests don't use print and println methods in your code.


enum LineType {
    SOLID, DOTTED, DASHED, DOUBLE;
}
static String LineType(LineType lineType) {
    return "The line is " + lineType.toString().toLowerCase() + " type";
}

public static String drawLine(LineType lineType) {
        return LineType(lineType);
}
