package pro1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunFact8Test
{
    @Test
    void test01()
    {
        var data = TestDataUtils.getTestData();
        var result = FunFact8.getFunFact(data);
        assertEquals(
                List.of("Liberec","Brno-město","Brno-venkov","Praha-východ","Praha-západ"),
                result
        );
    }
}
