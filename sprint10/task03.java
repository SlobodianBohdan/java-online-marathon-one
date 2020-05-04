//        Suppose we have class hierarchy that corresponds next class diagram:
//        Shape interface
//        Using Wrapper generic class from task #1, modify it so that it can only wrap objects that implement the Shape interface (Square, Circle, etc.).
//        For example:
//        * For correct passing of all tests don't use print and println methods in your code.

class Wrapper <T extends Shape> {
    private T value ;

    public Wrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
