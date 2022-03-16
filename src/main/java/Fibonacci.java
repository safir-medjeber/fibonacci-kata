public class Fibonacci {
    
    public int fib(int input) {
        if(input == 0 || input == 1)
            return input;
        return fib(input-1)+ fib(input-2);

    }
}
