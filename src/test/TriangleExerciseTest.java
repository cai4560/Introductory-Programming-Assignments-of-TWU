package test;

import api.ITriangleExercise;
import impl.TriangleExercise;
import org.junit.Assert;
import org.junit.Test;

public class TriangleExerciseTest extends BaseResource {
    private ITriangleExercise exercise = new TriangleExercise();

    @Test
    public void testEasiest() {
        exercise.easiest();
        String exceptResult = "*\n";
        Assert.assertEquals(exceptResult, bytes.toString());
    }

    @Test
    public void testHorizontal() {
        exercise.horizontal(5);
        String exceptResult = "*****\n";
        Assert.assertEquals(exceptResult, bytes.toString());
    }

    @Test
    public void testVertical() {
        exercise.vertical(5);
        String exceptResult = "*\n*\n*\n*\n*\n";
        Assert.assertEquals(exceptResult, bytes.toString());
    }

    @Test
    public void testRightTriangle() {
        exercise.rightTriangle(3);
        String exceptResult = "*\n**\n***\n";
        Assert.assertEquals(exceptResult, bytes.toString());
    }

    @Test
    public void testInvalidInput() {
        String exceptResult = "";
        exercise.horizontal(null);
        Assert.assertEquals(exceptResult, bytes.toString());

        exercise.horizontal(0);
        Assert.assertEquals(exceptResult, bytes.toString());
    }

}
