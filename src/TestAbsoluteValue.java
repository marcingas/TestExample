import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAbsoluteValue {
    @Test
    public void shouldReturnPositiveValueWhenGreaterThenZero(){
        //given
        int testValue = 1;
        AbsoluteValue absoluteValue = new AbsoluteValue();
        //when
        int actualValue = absoluteValue.countAbsoluteValue(testValue);
        //then
        Assert.assertEquals(testValue,actualValue);

    }
    @Test
    public void shouldReturnPositiveValueWhenLessThenZero(){
        //given
        int testValue = -1;
        AbsoluteValue absoluteValue = new AbsoluteValue();
        //when
        int actualValue = absoluteValue.countAbsoluteValue(testValue);
        int properValue = Math.abs(testValue);
        //then
        Assert.assertEquals(properValue,actualValue);

    }
}
