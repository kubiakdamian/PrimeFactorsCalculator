import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.qbsapps.PrimeFactorsCalculator;
import pl.qbsapps.exception.PrimeNumberException;
import pl.qbsapps.exception.WrongNumberException;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PrimeFactorsTest {
    private static PrimeFactorsCalculator primeFactorsCalculator;

    @BeforeAll
    static void setup() {
        primeFactorsCalculator = new PrimeFactorsCalculator();
    }

    @Test
    void calculatorShouldReturnProperArrayOfFactors() {
        assertEquals(Arrays.asList(2, 2), primeFactorsCalculator.distributeIntoPrimeFactors(4));
        assertEquals(Arrays.asList(2, 3), primeFactorsCalculator.distributeIntoPrimeFactors(6));
        assertEquals(Arrays.asList(2, 2, 3), primeFactorsCalculator.distributeIntoPrimeFactors(12));
        assertEquals(Arrays.asList(5, 5), primeFactorsCalculator.distributeIntoPrimeFactors(25));
        assertEquals(Arrays.asList(2, 2, 3, 5), primeFactorsCalculator.distributeIntoPrimeFactors(60));
        assertEquals(Arrays.asList(2, 2, 5, 5), primeFactorsCalculator.distributeIntoPrimeFactors(100));
        assertEquals(Arrays.asList(2, 2, 5, 5, 5), primeFactorsCalculator.distributeIntoPrimeFactors(500));
        assertEquals(Arrays.asList(13, 59), primeFactorsCalculator.distributeIntoPrimeFactors(767));
        assertEquals(Arrays.asList(2, 2, 2, 3, 37, 139), primeFactorsCalculator.distributeIntoPrimeFactors(123432));
    }

    @Test
    void distributingNotPositiveNumberShouldThrowWrongNumberException() {
        assertThrows(WrongNumberException.class, () -> primeFactorsCalculator.distributeIntoPrimeFactors(-100));
        assertThrows(WrongNumberException.class, () -> primeFactorsCalculator.distributeIntoPrimeFactors(-23423));
        assertThrows(WrongNumberException.class, () -> primeFactorsCalculator.distributeIntoPrimeFactors(-5));
        assertThrows(WrongNumberException.class, () -> primeFactorsCalculator.distributeIntoPrimeFactors(-2));
        assertThrows(WrongNumberException.class, () -> primeFactorsCalculator.distributeIntoPrimeFactors(0));
    }

    @Test
    void distributingPrimeNumberShouldThrowPrimeNumberException() {
        assertThrows(PrimeNumberException.class, () -> primeFactorsCalculator.distributeIntoPrimeFactors(5));
        assertThrows(PrimeNumberException.class, () -> primeFactorsCalculator.distributeIntoPrimeFactors(7));
        assertThrows(PrimeNumberException.class, () -> primeFactorsCalculator.distributeIntoPrimeFactors(23));
        assertThrows(PrimeNumberException.class, () -> primeFactorsCalculator.distributeIntoPrimeFactors(71));
        assertThrows(PrimeNumberException.class, () -> primeFactorsCalculator.distributeIntoPrimeFactors(97));
    }
}
