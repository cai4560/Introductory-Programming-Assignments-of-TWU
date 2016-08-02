package test;

import api.IDiamondExercises;
import impl.DiamondExercises;
import org.junit.Assert;
import org.junit.Test;

public class DiamondExercisesTest extends BaseResource {
    private IDiamondExercises exercises = new DiamondExercises();

    @Test
    public void testIsosceles() {
        exercises.isosceles(3);
        String expectResult = "  *  \n *** \n*****\n";
        Assert.assertEquals(expectResult, bytes.toString());
    }

    @Test
    public void testDiamond() {
        exercises.diamond(3);
        String expectResult = "  *  \n *** \n*****\n *** \n  *  \n";
        Assert.assertEquals(expectResult, bytes.toString());
    }

    @Test
    public void testDiamondWithName() {
        exercises.diamondWithName(3);
        String expectResult = "  *  \n *** \nLuoJie\n *** \n  *  \n";
        Assert.assertEquals(expectResult, bytes.toString());
    }
}
