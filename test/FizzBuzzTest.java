
import api.IFizzBuzzExercise;
import impl.FizzBuzzExercise;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest extends BaseResource{
    private IFizzBuzzExercise exercise = new FizzBuzzExercise();

    @Test
    public void testFizzBuzz() {
        exercise.FizzBuzz(20);
        String exceptResult = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n" +
                "16\n17\nFizz\n19\nBuzz\n";
        Assert.assertEquals(exceptResult, bytes.toString());
    }
}
