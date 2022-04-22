package solution.dynamic_programming;

import junit.framework.TestCase;

import java.time.Duration;
import java.time.Instant;

public class FibTest extends TestCase {
    public void testFib() {
        var time = Instant.now().toEpochMilli();
        var fib = new Fib();
        int n = fib.fib_simple(100000);
        var duration = Duration.between(Instant.ofEpochMilli(time), Instant.now());
        System.out.printf("n=%d, time=%d", n, duration.toMillis());
    }

    public void testFib2() {
        var time = Instant.now();
        var fib = new Fib();
        int n = fib.fib_recursive(37);
        var duration = Duration.between(time, Instant.now());
        System.out.printf("n=%d, time=%d", n, duration.toMillis());

        for(int i=0; i<30; i++)
        {
            assertEquals(fib.fib_recursive(i), fib.fib_simple(i));
        }
    }
}

