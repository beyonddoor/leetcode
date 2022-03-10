package testUtil;

import junit.framework.TestCase;
import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AssertUtil {
    public static <T> void assertListEqualsIgnoreOrder(List<T> expected, List<T> actual, Comparator<? super T> comparator) {
        TestCase.assertEquals(expected.size(), actual.size());
        var expectedCopy = new ArrayList<>(expected);
        var actualCopy = new ArrayList<>(actual);
        expectedCopy.sort(comparator);
        actualCopy.sort(comparator);
        Assert.assertArrayEquals(expectedCopy.toArray(), actualCopy.toArray());
    }

//    public static <T> void assertArrayEqualsIgnoreOrder(T[] expected, T[] actual, Comparator<? super T> comparator) {
//        TestCase.assertEquals(expected.length, actual.length);
//        var expectedCopy = Array.newInstance();
//        var actualCopy = new T[actual.length];
//        expectedCopy.sort(comparator);
//        actualCopy.sort(comparator);
//        Assert.assertArrayEquals(expectedCopy.toArray(), actualCopy.toArray());
//    }
}
