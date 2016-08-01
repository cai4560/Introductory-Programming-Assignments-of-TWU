package impl;

import api.ITriangleExercises;

public class TriangleExercises implements ITriangleExercises {
    private static char asterisk = '*';

    @Override
    public void easiest() {
        System.out.println(asterisk);
    }

    @Override
    public void horizontal(Integer times) {
        if (isValid(times)) {
            for (Integer index = 0; index < times; index++) {
                System.out.print(asterisk);
            }
            System.out.println();
        }
    }

    @Override
    public void vertical(Integer times) {
        if (isValid(times)) {
            for (Integer index = 0; index < times; index++) {
                System.out.println(asterisk);
            }
        }
    }

    @Override
    public void rightTriangle(Integer times) {
        if (isValid(times)) {
            for (Integer row = 0 ; row < times ; row ++) {
                for (Integer col = 0; col < row + 1; col++) {
                    System.out.print(asterisk);
                }
                System.out.println();
            }
        }
    }

    public Boolean isValid(Integer times) {
        return !(times == null || times.equals(0));
    }
}
