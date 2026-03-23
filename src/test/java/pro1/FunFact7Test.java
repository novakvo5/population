package pro1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunFact7Test
{
    @Test
    void test01()
    {
        var data = TestDataUtils.getTestData();
        var result = FunFact7.getFunFact(data);
        assertEquals(
                "Nová Ves u Kolína",
                result
        );
    }

    @Test
    void test01Strict()
    {
        var data = TestDataUtils.getTestData();
        var result = FunFact7.getFunFactStrict(data);
        assertEquals(
                "Dvůr Králové nad Labem",
                result
        );
    }
}
