package pro1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunFact6Test
{
    @Test
    void test01()
    {
        var data = TestDataUtils.getTestData();
        var result = FunFact6.getFunFact(data);
        assertEquals(
                "Velký Osek",
                result
        );
    }
}
