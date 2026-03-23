package pro1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunFact5Test
{
    @Test
    void test01()
    {
        var data = TestDataUtils.getTestData();
        var result = FunFact5.getFunFact(data,3);
        assertEquals(
                List.of("Malá Lhota","Velmi Malá Lhota","Lhota nad Labem"),
                result
        );
    }

    @Test

    void test01Joined()
    {
        var data = TestDataUtils.getTestData();
        var result = FunFact5.getFunFactJoined(data,3);
        assertEquals(
                "Malá Lhota,Velmi Malá Lhota,Lhota nad Labem",
                result
        );
    }
}
