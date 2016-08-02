package impl;

import api.ITriangleExercise;
import impl.common.NumberValidator;

public class TriangleExercise implements ITriangleExercise {
    private static Character asterisk = '*';
    private NumberValidator validator = new NumberValidator();

    @Override
    public void easiest() {
        System.out.println(asterisk);
    }

    @Override
    public void horizontal(Integer times) {
        if (validator.isValid(times)) {
            for (Integer index = 0; index < times; index++) {
                System.out.print(asterisk);
            }
            System.out.println();
        }
    }

    @Override
    public void vertical(Integer times) {
        if (validator.isValid(times)) {
            for (Integer index = 0; index < times; index++) {
                System.out.println(asterisk);
            }
        }
    }

    @Override
    public void rightTriangle(Integer times) {
        if (validator.isValid(times)) {
            for (Integer row = 0 ; row < times ; row ++) {
                for (Integer col = 0; col < row + 1; col++) {
                    System.out.print(asterisk);
                }
                System.out.println();
            }
        }
    }
}
