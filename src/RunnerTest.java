import org.testng.Assert;
import org.testng.annotations.Test;

public class RunnerTest {
    @Test
    public void shouldReturnNumberWhenNisMinus9() {
        //given
        int testNumber = -8;
        Runner runner = new Runner();
        //when
        int actualNumber = runner.changeNumber(testNumber);
        //then
        Assert.assertEquals(testNumber, actualNumber);
    }

    @Test
    public void shouldReturnNumberWhenMinutTenToZero() {

        Runner runner = new Runner();
        for (int i = 0; i <= 10; i++) {
            //given
            int testNumber = i - 10;
            //when
            int actualNumber = runner.changeNumber(testNumber);
            //then
            Assert.assertEquals(testNumber, actualNumber);
        }
    }

    @Test
    public void shouldReturn2forEvenNumbersLessThenMinutTen() {
        //given
        Runner runner = new Runner();
        int testNumber = -12;
        int properResult = 2;
        //when
        int actualResult = runner.changeNumber(testNumber);
        //then
        Assert.assertEquals(properResult, actualResult);
    }

    @Test
    public void shouldReturn2forEvenNumbersGreaterThenZero() {
        //given
        Runner runner = new Runner();
        int testNumber = 2;
        int properResult = 2;
        //when
        int actualResult = runner.changeNumber(testNumber);
        //then
        Assert.assertEquals(properResult, actualResult);

    }

    @Test
    public void ShouldThrowIllegalStateExcForOddNumbersGreaterThenZero() {
        //given
        int testNumber = 1;
        Runner runner = new Runner();
        //when
        //then
        Assert.assertThrows(IllegalStateException.class, () -> {
            runner.changeNumber(testNumber);
        });
    }
    @Test
    public void ShouldThrowIllegalStateExcForEvenNumbersLessThenMinusTen() {
        //given
        int testNumber = -11;
        Runner runner = new Runner();
        //when
        //then
        Assert.assertThrows(IllegalStateException.class, () -> {
            runner.changeNumber(testNumber);
        });
    }
}
