// We have the class PrintStackTraceDemo with four methods: a, m, t, x.
// One of the methods of PrintStackTraceDemo throws IOException, 
// the other one catches the exception and prints a stack trace.
// We have this part of stack trace that was generated in PrintStackTraceDemo class:
// java.io.IOException
//      PrintStackTraceDemo.t(__tester__.java:19)
//      PrintStackTraceDemo.m(__tester__.java:27)
//      PrintStackTraceDemo.a(__tester__.java:23)
//      PrintStackTraceDemo.x(__tester__.java:8)
// Please, fill in the gaps in the code of the PrintStackTraceDemo class so that the stack trace will remain the same.


class InsufficientAmountException extends RuntimeException{
    private double amount;

    public InsufficientAmountException(double needs) {
        super("Sorry, but you are short $" + needs);
        this.amount = needs;
    }

    public String getMessage() {
        return super.getMessage();
    }

    public double getAmount() {
        return amount;
    }
}
