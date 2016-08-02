import api.IPrimeFactorsExercise;
import impl.PrimeFactorsExercises;
import org.junit.Assert;
import org.junit.Test;

public class PrimeFactorsExerciseTest {
    private IPrimeFactorsExercise exercise = new PrimeFactorsExercises();

    @Test
    public void testGetPrimeFactors() {
        String exceptResult = "2, 3, 5";
        Assert.assertEquals(exceptResult, exercise.getPrimeFactors(30));

        exceptResult = "2, 2, 3";
        Assert.assertEquals(exceptResult, exercise.getPrimeFactors(12));

        exceptResult = "97";
        Assert.assertEquals(exceptResult, exercise.getPrimeFactors(97));

        Assert.assertNull(exercise.getPrimeFactors(1));
    }
}
