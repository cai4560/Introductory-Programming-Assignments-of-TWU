package impl;

import api.IFizzBuzzExercise;
import impl.common.Constant;
import impl.common.NumberValidator;

public class FizzBuzzExercise implements IFizzBuzzExercise {
    private NumberValidator validator = new NumberValidator();

    @Override
    public void FizzBuzz(Integer upperLimit) {
        if (validator.isValid(upperLimit)) {
            for (Integer index = 1; index <= upperLimit; index++) {
                if (NotFizzBuzzNumber(index)) {
                    System.out.println(index.toString());
                } else {
                    printFizzOrBuzz(index);
                }

            }
        }
    }

    public Boolean NotFizzBuzzNumber(Integer number) {
        return number % Constant.FizzBuzz.FIZZ_NUMBER != 0
                && number % Constant.FizzBuzz.BUZZ_NUMBER != 0;
    }

    public void printFizzOrBuzz(Integer number) {
        String result = "";
        if (number % Constant.FizzBuzz.FIZZ_NUMBER == 0) {
            result = result.concat(Constant.FizzBuzz.FIZZ);
        }
        if (number % Constant.FizzBuzz.BUZZ_NUMBER == 0){
            result = result.concat(Constant.FizzBuzz.BUZZ);
        }
        System.out.println(result);
    }
}
