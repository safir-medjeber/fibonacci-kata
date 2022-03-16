import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void given_fib_0_should_return_0() {
        Fibonacci fibonacci = new Fibonacci();

        int actual = fibonacci.fib(0);

        Assertions.assertEquals(0, actual);
    }

    @Test
    public void given_fib_1_should_return_1() {
        Fibonacci fibonacci = new Fibonacci();

        int actual = fibonacci.fib(1);

        Assertions.assertEquals(1, actual);
    }



    @Test
    public void given_fib_2_should_return_1() {
        Fibonacci fibonacci = new Fibonacci();

        int actual = fibonacci.fib(2);

        Assertions.assertEquals(1, actual);
    }




    @Test
    public void given_fib_4_should_return_3() {
        Fibonacci fibonacci = new Fibonacci();

        int actual = fibonacci.fib(4);

        Assertions.assertEquals(3, actual);
    }

    @Test
    public void given_fib_15_should_return_610() {
        Fibonacci fibonacci = new Fibonacci();

        int actual = fibonacci.fib(15);

        Assertions.assertEquals(610, actual);
    }


}