import org.junit.Assert;
import org.junit.Test;

/**
 * @author chenzhenya
 * @date 2019/10/31 20:24
 */
public class PrimeUtilTest {

    @Test
    public void testGetEmptyResult() {
        int[] expected = {};

        Assert.assertArrayEquals(expected, PrimeUtil.getPrimes(2));
        Assert.assertArrayEquals(expected, PrimeUtil.getPrimes(1));
        Assert.assertArrayEquals(expected, PrimeUtil.getPrimes(0));
        Assert.assertArrayEquals(expected, PrimeUtil.getPrimes(-1));
    }

    @Test
    public void testGetPrimes() {
        Assert.assertArrayEquals(new int[]{2}, PrimeUtil.getPrimes(3));
        Assert.assertArrayEquals(new int[]{2, 3, 5}, PrimeUtil.getPrimes(7));
        Assert.assertArrayEquals(new int[]{2, 3, 5, 7, 11, 13}, PrimeUtil.getPrimes(15));
    }
}
