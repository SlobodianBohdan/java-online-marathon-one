//        Suppose we have class hierarchy that corresponds next class diagram:
//        Shape interface
//        Using Wrapper generic class from task #1, modify it so that it can only wrap objects that implement the Shape interface (Square, Circle, etc.).
//        For example:
//        * For correct passing of all tests don't use print and println methods in your code.

class ArrayUtil {
    public static <T> T setAndReturn(T[] array, T value, int index){
          return array[index] = value;
    }
}
