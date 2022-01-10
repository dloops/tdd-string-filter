import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class StringFilterTest {

    private StringFilter stringFilter;
    private String text;

    @Before
    public void setup() {
        this.stringFilter = new StringFilter();
        text = "ITCLiNicAl";
    }

    @Test
    public void createUpperCaseStringFrom0Test() {
        String result;
        result = stringFilter.createNewString(text, 0);

        assertEquals("ITCLiNicAl", result);
    }

    @Test
    public void createUpperCaseStringFrom1Test() {
        String result;
        result = stringFilter.createNewString(text, 1);

        assertEquals("ITCLNA", result);
    }

    @Test
    public void createUpperCaseStringFrom2Test() {
        String result;
        result = stringFilter.createNewString(text, 2);

        assertEquals("TLN", result);
    }

    @Test
    public void createUpperCaseStringFrom3Test() {
        String result;
        result = stringFilter.createNewString(text, 3);

        assertEquals("CNA", result);
    }

    @Test
    public void createUpperCaseStringFrom100Test() {
        String result;
        result = stringFilter.createNewString(text, 100);

        assertEquals("", result);
    }

    @Test
    public void createUpperCaseStringFromNegativeTest() {
        String result;
        result = stringFilter.createNewString(text, -1);

        assertEquals("", result);
    }

    @Test
    public void acceptDifferentCharactersTest() {
        String specialString = "!tCL1Nical";
        String result;
        result = stringFilter.createNewString(specialString, 1);

        assertEquals("!CL1N", result);
    }

    @Test
    public void characterCountMapTest() {
        HashMap<String, Integer> testMap = new HashMap<String, Integer>() {{
            put("I", 2);
            put("C", 2);
            put("L", 2);
            put("N", 1);
            put("A", 1);
        }};

        assertEquals(testMap, stringFilter.charCountMap);
    }


}
