//        Suppose we have the next generic class:
//        In the class ArrayUtil write static method named "averageValue(...)" that takes an object of Array type as input, and returns the average value its elements.
//        The given method should returns value of double type and take any array, whose elements extends Number type.
//        Examples of usage:
//        * For correct passing of all tests don't use print and println methods in your code.

class ArrayUtil {
    public static <T extends Number> double averageValue(Array<T> array) {
        double sumElements = 0;
        for (int i = 0; i < array.length(); i++) {
            if (array.get(0) instanceof Integer)
                sumElements += (Integer) array.get(i);
            if (array.get(0) instanceof Double)
                sumElements += (Double) array.get(i);
            if (array.get(0) instanceof Float)
                sumElements += (Float) array.get(i);
        }
        return sumElements / array.length();
    }
}
