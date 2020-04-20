// Suppose we have execute method with next signature:
// execute method
// where the Strategy is the next interface :
// Strategy interface
// Using anonymous classes concept, call the execute method 4 times with different strategy (override method doOperation from Strategy interface):
// Add a to b   \\   (a + b)
// Subtract b from a   \\   (a - b)
// Multiply a by b   \\   (a * b)
// Divide a by b   \\   (a / b)
// * For correct passing of all tests don't use print and println methods in your code.


public static void addAtoB(int a, int b) {
    execute( a, b, new Strategy(){
        @Override
        public double doOperation(int a, int b) {
            return a + b;
        }
    });
}

public static void subtractBfromA(int a, int b) {
    execute( a, b, new Strategy(){
        @Override
        public double doOperation(int a, int b) {
            return a - b;
        }
    });
}

public static void multiplyAbyB(int a, int b) {
    execute( a, b, new Strategy(){
        @Override
        public double doOperation(int a, int b) {
            return a * b;
        }
    });
}

public static void divideAbyB(int a, int b) {
    execute( a, b, new Strategy(){
        @Override
        public double doOperation(int a, int b) {
            return a / b;
        }
    });
}
