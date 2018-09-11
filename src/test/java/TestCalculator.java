import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void test1plus1 () {

        // Arrange : organiser (donnees d'entres et le resultat attendu)
        int arg1 = 1;
        int arg2 = 1;
        int expectedResult = 2;

        // Act : action
        int returnedResult = Calculator.add(arg1, arg2);

        // Assert : verifier
        Assert.assertEquals(expectedResult, returnedResult);

    }


    @Test (expected = IndexOutOfBoundsException.class)
    public void testMax () {

        // Arrange : organiser (donnees d'entres et le resultat attendu)
        int arg1 = Integer.MAX_VALUE;
        int arg2 = 1;

        // Act : action
        int returnedResult = Calculator.add(arg1, arg2);
    }


    @Test (expected = IndexOutOfBoundsException.class)
    public void testMin () {

        // Arrange : organiser (donnees d'entres et le resultat attendu)
        int arg1 = Integer.MIN_VALUE;
        int arg2 = -1;

        // Act : action
        int expectedResult = Calculator.sub(arg1, arg2);
   }

    @Test
     public void failedTest () {
        // Arrange : organiser (donnees d'entres et le resultat attendu)
        int arg1 = 1;
        int arg2 = 1;
        int expectedResult = 3;

        // Act : action
        int returnedResult = Calculator.add(arg1, arg2);

        // Assert : verifier
        Assert.assertEquals(expectedResult, returnedResult);

    }

}
