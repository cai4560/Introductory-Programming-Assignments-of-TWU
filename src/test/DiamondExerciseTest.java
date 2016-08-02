package test;

import api.IDiamondExercise;
import impl.DiamondExercise;
import org.junit.Assert;
import org.junit.Test;

public class DiamondExerciseTest extends BaseResource {
    private IDiamondExercise exercise = new DiamondExercise();

    @Test
    public void testIsosceles() {
        exercise.isosceles(3);
        String expectResult = "  *  \n *** \n*****\n";
        Assert.assertEquals(expectResult, bytes.toString());
    }

    @Test
    public void testDiamond() {
        exercise.diamond(3);
        String expectResult = "  *  \n *** \n*****\n *** \n  *  \n";
        Assert.assertEquals(expectResult, bytes.toString());
    }

    @Test
    public void testDiamondWithName() {
        exercise.diamondWithName(3);
        String expectResult = "  *  \n *** \nLuoJie\n *** \n  *  \n";
        Assert.assertEquals(expectResult, bytes.toString());
    }
}
