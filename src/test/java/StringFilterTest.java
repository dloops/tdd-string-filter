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
        String result = stringFilter.createNewString(text, 3);

        assertEquals("CNA", result);
    }

    @Test
    public void createUpperCaseStringFrom100Test() {
        String result = stringFilter.createNewString(text, 100);

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
        HashMap<Character, Integer> testMap = new HashMap<Character, Integer>() {{
            put("I".charAt(0), 2);
            put("C".charAt(0), 2);
            put("L".charAt(0), 2);
            put("N".charAt(0), 1);
            put("A".charAt(0), 1);
        }};

        stringFilter.charCount("ICLINCAL");

        assertEquals(testMap, stringFilter.getCharCountMap());
    }

    @Test
    public void characterCountTest() {
        String expectedCount = "A = 1" + "\n" +
                "C = 2" + "\n" +
                "I = 2" + "\n" +
                "L = 2" + "\n" +
                "N = 1";

        String result = stringFilter.charCount("ICLINCAL");

        assertEquals(expectedCount, result);
    }

}
