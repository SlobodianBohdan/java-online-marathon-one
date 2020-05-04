//        Create a Wrapper generic class with generic private field of type T named value.
//        Also in the Wrapper class define a parametrized public constructor and access methods with setValue and getValue name.
//        * For correct passing of all tests don't use print and println methods in your code.

class Wrapper1 <T>{
    private T value ;

    public Wrapper1(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
