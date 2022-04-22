import java.util.Date;

public class TestPrintf {
    public static void main(String[] args) {
        System.out.printf("hello%nworld%n");
        System.out.printf("int=%d,long=%d", 100, 1000000L);

        // boolean
        System.out.printf("%b%n", null);
        System.out.printf("%B%n", false);
        System.out.printf("%B%n", 5.3);
        System.out.printf("%b%n", "random text");

        // string
        System.out.printf("'%15S' %n", "baeldung");
        System.out.printf("'%-15S' %n", "baeldung");

        Date date = new Date();
        System.out.printf("%tT%n", date);
        System.out.printf("%1$tA, %1$tB %1$tY %n", date);
        System.out.printf("%1$td.%1$tm.%1$ty %n", date);
    }
}
