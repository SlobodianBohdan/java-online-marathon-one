// Please, create a static Consumer implementation cons that takes an array of doubles as a parameter and changes it using the next rule: all values that are greater than 2 should be multiplied by 0.8, and other values should be multiplied by 0.9.
// Also, please. implement a static method getChanged that takes an array of doubles as a first parameter and  Consumer as a second. The method should return an array changed by the second parameter.
// getChanged method should not change initial array. 


import java.util.function.Consumer;


class App {
    static Consumer<double[]> cons = doubles -> {
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = (doubles[i])>2 ? doubles[i]*0.8 : doubles[i]*0.9;
        }
    };


    public static double[] getChanged(double[] initialArray, Consumer<double[]> consumer) {
        double [] newArray = initialArray.clone();
        consumer.accept(newArray);
        return newArray;
    }
}
