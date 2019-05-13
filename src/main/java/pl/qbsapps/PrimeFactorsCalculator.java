package pl.qbsapps;

import pl.qbsapps.exception.PrimeNumberException;
import pl.qbsapps.exception.WrongNumberException;

import java.util.ArrayList;

public class PrimeFactorsCalculator {
    public ArrayList<Integer> distributeIntoPrimeFactors(int number) {
        if (checkIfNumberIsPrime(number)) {
            throw new PrimeNumberException();
        }

        if (number <= 0) {
            throw new WrongNumberException();
        }

        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= number / i; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }

        if (number > 1) {
            factors.add(number);
        }

        return factors;
    }

    private boolean checkIfNumberIsPrime(int number) {
        if (number < 2) {
            throw new WrongNumberException();
        }

        for (int divider = 2; divider <= number / 2; divider++) {
            if (number % divider == 0) {
                return false;
            }
        }

        return true;
    }
}
