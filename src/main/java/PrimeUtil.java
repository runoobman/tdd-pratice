import java.util.Arrays;

/**
 * @author chenzhenya
 * @date 2019/10/31 20:31
 */
public class PrimeUtil {

    /**
     * 获取比当前数小的素数数组
     * @param max
     * @return
     */
    public static int[] getPrimes(int max) {
        if (max <= 2) {
            return new int[0];
        }

        int[] primes = new int[max];
        int count = 0;
        for (int number = 2; number < max; number++) {
            if (isPrime(number)) {
                primes[count++] = number;
            }
        }
        return Arrays.copyOf(primes, count);
    }

    /**
     * 判断当前数是否为素数
     *
     * @param number
     * @return
     */
    public static boolean isPrime(int number) {
        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
