package test;

import api.ITriangleExercises;
import impl.TriangleExercises;
import org.junit.Assert;
import org.junit.Test;

public class TriangleExercisesTest extends BaseResource {
    private ITriangleExercises exercises = new TriangleExercises();

    @Test
    public void testEasiest() {
        exercises.easiest();
        String exceptResult = "*\n";
        Assert.assertEquals(exceptResult, bytes.toString());
    }

    @Test
    public void testHorizontal() {
        exercises.horizontal(5);
        String exceptResult = "*****\n";
        Assert.assertEquals(exceptResult, bytes.toString());
    }

    @Test
    public void testVertical() {
        exercises.vertical(5);
        String exceptResult = "*\n*\n*\n*\n*\n";
        Assert.assertEquals(exceptResult, bytes.toString());
    }

    @Test
    public void testRightTriangle() {
        exercises.rightTriangle(3);
        String exceptResult = "*\n**\n***\n";
        Assert.assertEquals(exceptResult, bytes.toString());
    }

    @Test
    public void testInvalidInput() {
        String exceptResult = "";
        exercises.horizontal(null);
        Assert.assertEquals(exceptResult, bytes.toString());

        exercises.horizontal(0);
        Assert.assertEquals(exceptResult, bytes.toString());
    }

}
