package impl;

import api.IPrimeFactorsExercise;

public class PrimeFactorsExercises implements IPrimeFactorsExercise {
    @Override
    public String getPrimeFactors(Integer number) {
        if (isValid(number)) {
            String factorString = "";
            for (Integer index = 2; index <= number ; ) {
                if (number % index == 0) {
                    number /= index;
                    if (factorString.length() == 0) {
                        factorString = factorString.concat(index.toString());
                    } else {
                        factorString = factorString.concat(", " + index.toString());
                    }
                } else {
                    index ++;
                }
            }
            return factorString;
        }
        return null;
    }

    public Boolean isValid(Integer number) {
        return number != null && number != 0 && number != 1;
    }
}
